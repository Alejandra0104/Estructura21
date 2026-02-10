import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        metodos  m = new metodos();
        
        int n = 0;
        System.out.print("ingrese la dimensión del patio: ");
        n = sc.nextInt();
        mio[] r = new mio[n];
        r = m.LlenarRegistros(r);
        r = m.CalcularNuevoPago(r);
        m.MostrarRegistros(r);
    }
}
