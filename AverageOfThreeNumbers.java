import java.util.Scanner;

public class AverageOfThreeNumbers 
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
    
            // float answer = a + b + c / 3 ; RONG 
            float answer =(a + b + c) / 3 ;
            System.out.println(answer);

            sc.close();
        }
    }    
}
