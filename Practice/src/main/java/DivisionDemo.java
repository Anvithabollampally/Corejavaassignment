import java.util.Scanner;

public class DivisionDemo  {
    public static void main (String args []) throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();

        if(firstNumber / secondNumber==0)// Conditional statement.
            throw new ArithmeticException("number1");
        else System.out.println("The result is  "+  firstNumber/secondNumber);
    }
}
