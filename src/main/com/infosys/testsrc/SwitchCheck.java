package main.com.infosys.testsrc;

public class SwitchCheck {

    public String switchCheck(char grade){
        String result;
            switch(grade)
            {
                case 'A' :
                    System.out.println("Excellent!");
                    result = "Excellent!";
                    break;


                case 'B' :
                    System.out.println("Good");
                    result = "Good";
                    break;


                case 'C' :
                    System.out.println("Well done");
                    result = "Well done";
                    break;


                case 'D' :
                    System.out.println("You passed");
                    result = "You passed";
                    break;


                case 'E' :
                    System.out.println("Better try again");
                    result = "Better try again";
                    break;


                default :
                    System.out.println("Invalid grade");
                    result = "Invalid grade";
                    break;


            }
        return result;
    }

    public int subtract(int x,int y){
        int res = 0;
        if(x>=y){
           res = x-y;
        }
        else{
            res = y-x;
        }
        return res;
    }

    public int division(int x,int y){
        int res = 0;
        res = x/y;
        return res;
    }

    public int checkNestedSwitch(char operation,int x,int y){
        int result = 0;
        switch(operation)
        {
            case 'A' :
                Add add = new Add();
                result = add.addition(x,y);
                System.out.println("Your result is " + result);
                break;
            case 'S' :
                result = subtract(x,y);
                System.out.println("Your result is " + result);
                break;
            case 'M' :
                Multiply multiply = new Multiply(x,y);
                result = multiply.multiply();
                System.out.println("Your result is " + result);
                break;
            case 'D' :
                result = division(x,y);
                System.out.println("Your result is " + result);
                break;
            default :
                result = 333333333;
                System.out.println("Invalid search.");
                break;
        }
        return  result;
    }
}
