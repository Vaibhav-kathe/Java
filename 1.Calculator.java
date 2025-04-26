import java.util.*;
public class Calculator {
    public static void main(String args[]){
        System.out.println("Welcome to the Calculator");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("\nEnter Number 1 = ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2 = ");
            int num2 = sc.nextInt();

            System.out.println("\nChoose any 1 Operation : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");


            System.out.print("\nSelect the operation = ");
            int operation = sc.nextInt();

            switch(operation){
                case 1 : System.out.println("The Addition of "+num1+" and "+num2+" is = "+(num1+num2));
                break;

                case 2 : System.out.println("The Subtraction of "+num1+" and "+num2+" is = "+(num1-num2));
                break;

                case 3 : System.out.println("The Multiplication of "+num1+" and "+num2+" is = "+(num1*num2));
                break;
            
                case 4 :
                if(num2 == 0){
                    System.out.println("Error : Division by 0 is not allowed");
                }else{
                    System.out.println("The Division of "+num1+" and "+num2+" is = "+(num1/num2));
                }break;
            
                case 5 :
                if(num2 == 0){
                    System.out.println("Error : Division by 0 is not allowed");
                }else{
                    System.out.println("The Remainder of "+num1+" and "+num2+" is = "+(num1%num2));
                }break;

                case 6 : System.out.println("Exiting Calculator. Thank You...!");
                sc.close();
                System.exit(0);
                break;

                default: System.out.println("ERROR");
                break;
            }
        }
    }
}
