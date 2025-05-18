import java.util.Scanner;

public class GST_Bill
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {

            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
    
            System.out.println("pencil price = " + a + "$");
            System.out.println("pen price = " + b + "$");
            System.out.println("eraser price = " + c + "$");
    
            // a = a + (a * 0.18F);
            // b = b + (b * 0.18F);
            // c = c + (c * 0.18F);

            float total = a + b + c;
    
            System.out.println("\n****----------BILL-----------****");
            System.out.print("Bill = " + total + "$\n");
            
            float GSTtotal = total + (total * (0.18F));
    
            System.out.println("\n****----------BILL WITH 18% TAX(GST)-----------****");
            System.out.print("Bill = " + GSTtotal + "$");
        
            sc.close();
        }
    }
}
