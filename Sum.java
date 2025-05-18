import java.util.Scanner;

public class Sum
{
    public static void main(String args[])
    {
        System.out.println("hello World");

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // int a = 4, b = 7;
            int sum = a + b;
            System.out.println("Your answer is :-\n" + a + " + " + b + " = " + sum);
        }
    }
}
