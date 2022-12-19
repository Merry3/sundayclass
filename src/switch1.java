// switch opration

import java.util.Scanner;

public class switch1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose one of the number");
        System.out.println("1 " + "2 " + "3 " + "4 " + "5 " + "6 " +"7 ");
        char oprator = scanner.next().charAt(0);
        switch (oprator){

            case '1':
                System.out.println("monday");
                break;
            case'2':
                System.out.println("tueday");
                break;
            case'3':
                System.out.println("wednesday");
                break;
            case'4':
                System.out.println("thursday");
                break;
            case'5':
                System.out.println("Friday");
                break;
            case'6':
                System.out.println("Saturday");
                break;
            case'7':
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error input");


        }
    }




}


