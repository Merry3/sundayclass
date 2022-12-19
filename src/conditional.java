// calculator

import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the first number");
        int num = scanner.nextInt();
        System.out.println("insert the second number");
        int num2 = scanner.nextInt();
        System.out.println("please choose one of the opration");
        System.out.println("+ " + "- " + "* " + "% ");
        char oprator = scanner.next().charAt(0);
        if (oprator == '+')
            System.out.println("The sum is"+ " "+(num + num2));
        else if
        (oprator == '-')
            System.out.println("The difference is"+ " "+(num - num2));
        else if (oprator == '*')
            System.out.println("The product is"+ " "+(num * num2));
        else {
            System.out.println("The modulo is"+ " "+(num % num2));


        }
    }
}