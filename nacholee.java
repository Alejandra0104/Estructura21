import java.util.Scanner;

public class nacholee 
{
    public static void main(String[] args) 
    {
        System.out.println("Hola mundo");

        int n1=0, n2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        n1 = sc.nextInt();

        System.out.println("Ingrese el número 2: ");
        n2 = sc.nextInt();

        System.out.println("La suma de los números es: " + (n1+n2));
    }
}
