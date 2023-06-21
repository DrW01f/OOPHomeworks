package homework2;

//класс с возможностями
public class Calculator implements Functions{   
  
    public double summ(double a, double b){
        return a+b;
   }

    public double subtraction(double a, double b) {
        return a-b;
    } 

    public double multiplication(double a, double b){
        return a*b;
    } 
 
    public double division(double a, double b) {
        return a/b; 
    } 
  
    public double exponentiationX(double a, double b){
        return Math.pow(a, b);
    }
}
 