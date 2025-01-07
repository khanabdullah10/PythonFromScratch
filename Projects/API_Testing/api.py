from flask import Flask,request,jsonify

app = Flask(__name__)

@app.route('/xyz',methods=['GET','POST'])
def test():
    if (request.method == 'POST'):
        a = request.json['num1']
        b  = request.json['num2']
        result = a+b
        return jsonify(str(result))

    @app.route('/khan/abdullah', methods=['GET', 'POST'])
    def test():
        if (request.method == 'POST'):
            a = request.json['num2']
            b = request.json['num3']
            result = a + b
            return jsonify(str(result)) 

if __name__== '__main__':
    app.run()