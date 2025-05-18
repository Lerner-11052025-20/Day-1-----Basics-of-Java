import java.util.Scanner;

public class AreaOfSquare
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {    
            int side , a;
            do
            {
                side = sc.nextInt();
                int area = side*side;
                System.out.println(area);
    
                System.out.println("\nIf you want to calculate again the area of a Square then enter\nfor continue -------> 1\nfor exit -------> 0");
                a = sc.nextInt();
                if(a != 1)    break;
            }while(true);
    
            sc.close();
        }
    }
}
