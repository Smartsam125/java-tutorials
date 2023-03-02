import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean continueLoop=true ;

        do {
            try {
                System.out.println("Enter an integer");
                int numerator = input.nextInt();
                System.out.println("Denominator");
                int denominator = input.nextInt();
                int result= quotient(denominator,numerator);
                System.out.printf("%nResult:%d/%d=%d\n",numerator,denominator,result);


            }
            catch (InputMismatchException inputMismatchException){
                System.out.printf("%nException:%s%n",inputMismatchException);
                input.nextLine();
                System.err.printf("You must Enter integers PLease try again:%n%n");

            }
            catch (ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");

            }

        }while (continueLoop);


    }
    public static int quotient (int denominator,int numerator) throws ArithmeticException
    {
        return numerator/denominator;


    }
}
