package homework2;
//Написать калькулятор в ООП стиле(инкапсуляция, наследование.полиморфизм)

import java.util.Scanner;

public class Main extends Calculator{
    
    public static void main(String[] args) {    
    String action;
    Double firstCount;
    Double secondCount;
    Scanner scanner = new Scanner(System.in);
    Calculator calc = new Calculator();        
    
    System.out.println("Введите цифру для выбора действия: ");
    System.out.println("1 - сложение, 2 вычитание, 3 умножение, 4 деление, 5 возведение в степень");
    System.out.println("Или нажмите 0 для выхода");
    action = scanner.nextLine();
    System.out.println("Введите первое число: ");
    firstCount = Double.parseDouble(scanner.nextLine());
    System.out.println("Введите второе число: ");
    secondCount = Double.parseDouble(scanner.nextLine()); 


        switch(action){
            case "1": {
                System.out.println(calc.summ(firstCount, secondCount));
                break;
            }
            case "2": {
                System.out.println(calc.subtraction(firstCount, secondCount));
                break;
            }
            case "3": {
                System.out.println(calc.multiplication(firstCount, secondCount));
                break;
            }
            case "4": {
                System.out.println(calc.division(firstCount, secondCount));
                break;
            }
            case "5": {
                System.out.println(calc.exponentiationX(firstCount, secondCount));
                break;
            }
            case "0": {
                break;
            }

        }
    }

}
