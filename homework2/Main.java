package homework2;
//Написать калькулятор в ООП стиле(инкапсуляция, наследование.полиморфизм)

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {    
    String action;
    Double firstCount;
    Double secondCount;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Введите цифру для выбора действия: ");
    System.out.println("1 - сложение, 2 вычитание, 3 умножение, 4 деление, 5 возведение в степень");
    action = scanner.nextLine();
    System.out.println("Введите первое число: ");
    firstCount = Double.parseDouble(scanner.nextLine());
    System.out.println("Введите второе число: ");
    secondCount = Double.parseDouble(scanner.nextLine());


        switch(action){
            case "+":

        }
    }

}
