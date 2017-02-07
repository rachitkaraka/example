package main.com.infosys.testsrc;

public class Add {
    public int addition(int x,int y){
        int c;
        c = x+y;
        return c;
    }

    public int addition(int x,int y,int z){
        int c;
        c = x+y+z;
        return c;
    }

    public int printResult(int x){
        int sum = 0;
        for(int i=0;i<x;i++){
            sum = addition(x,x);
            System.out.println("Sum is:"+sum);
        }
        return sum;
    }

    public int checkCondition(int x){
        int sum = 0;
        String check = null;
        for(int i=0;i<x;i++) {
            if (i == 5) {
                sum = addition(x,x);
                System.out.println("Sum is:"+sum);
                check = "Condition met";
                System.out.println(check);
            }
            else{
                sum = addition(x,x,x);
                check = "Condition not met";
                System.out.println(check);
            }
        }
        return sum;
    }

    public Boolean validate(final int primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int whileCheck(int x,int y){
        int sum = 0;
        while(x>y){
            sum = addition(x,y);
            y++;
            System.out.println("Sum is:"+sum);
        }
        return sum;
    }

    public int doWhileCheck(int x,int y){
        int sum = 0;
        do{
            sum = addition(x,y);
            y++;
            System.out.println("The Sum is:"+sum);
        }while(x>y);
        return sum;
    }
	
	public int doDhileCheck(int x,int y){
        int sum = 0;
        do{
            sum = addition(x,y);
            y++;
            System.out.println("The Sum is:"+sum);
        }while(x>y);
        return sum;
    }
}