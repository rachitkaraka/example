package main.com.infosys.testsrc;

public class Multiply {
    int x = 0;
    int y = 0;
    int result = 0;
    public Multiply(){
    }
    public Multiply(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int multiply(){
        result = x*y;
        return result;
    }
    private double divideByTwo(){
        double mul = multiply();
        double divResult = mul/2;
        return divResult;
    }

    public double multiplyByTwo(){
        double div = divideByTwo();
        double mulResult = div*2;
        return mulResult;
    }

    public double callPrivateMethod(int a,int b){
        double res;
        this.x = a;
        this.y = b;
        result = multiply();
        System.out.println(result);
        res = divideByTwo();
        System.out.println(res);
        res = multiplyByTwo();
        System.out.println(res);
        return res;
    }
}
