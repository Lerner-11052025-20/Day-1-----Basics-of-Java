import java.util.Scanner;

public class InputFromUser
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number a = ");
        int a = sc.nextInt();
        System.out.print("Enter number b = ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of a and b is : " + sum);
        int multiplication = a * b;
        System.out.println("The into of a and b is : " + multiplication);
    }
}
