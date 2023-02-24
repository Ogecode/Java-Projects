public class Calculator {

    //add a constructor

    public Calculator(){

    }
    //create  a methods to return int add
    public int add( int a , int b){
        return a + b;
    }

    public int  subtract ( int a , int b){
        return a - b;
    }

    public int  multiply ( int a , int b){
        return a * b;
    }

    public int  divide ( int a , int b){
        return a / b;
    }

    public int  modulo ( int a , int b){
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();


    }
}
