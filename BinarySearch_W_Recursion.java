public class BinarySearch_W_Recursion {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
       int target = 57;
       int ans = BinarySearch(arr,target,0,arr.length-1);
       System.out.println(ans);  
        
    }

    static int BinarySearch(int[] arr,int target, int s, int e  ){

        if(s >  e){
            
        return -1;

        }

        int m = (s + e)/2;
        if(arr[m]==target){
            return m;
        }

        if(arr[m] < target){
            BinarySearch(arr,target,s,m-1);

        }
        return BinarySearch(arr,target,m+1,e);


    }
    
}
