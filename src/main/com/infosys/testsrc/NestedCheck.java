package main.com.infosys.testsrc;

public class NestedCheck {
    public boolean checkEven(int x){
        if(x%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkEvenOrOdd(int x){
        boolean result;
        NestedClass nestedClass = new NestedClass();
        result = nestedClass.checkOdd(x);
        return result;
    }

    public class NestedClass{
        public boolean checkOdd(int x){
            if(x%2==0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}
