import java.util.Scanner;


public class SquareInteger {

    
    public static void main(String[] args) {
            int acc = 0;
            int odd = 1;
            int n;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("This program computes the square of an Integer");
            System.out.println();
            System.out.println("Enter an Integer: ");
            
            n = scanner.nextInt();
            
            for (int i = 0; i < n; i++){
                acc += odd;
                odd += 2;
            }
                
            System.out.println("The square of " + n + " is " + acc);
            
            scanner.close();

            }
}