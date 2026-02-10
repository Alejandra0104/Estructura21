import java.util.Scanner;

public class metodos 
{
    Scanner sc = new Scanner(System.in);

    public mio[] LlenarRegistros(mio[]r)
    {
            for(int i=0; i < r.length; i++)
            {

                mio o = new mio();
                System.out.print("ingrese la marca: ");
                
                o.setMarca(sc.next());
                System.out.print("ingrese tipo de vehiculo: ");
                o.setTipo(sc.next());
                System.out.print("ingrese el cilindraje del vehiculo: ");
                o.setCilin(sc.nextInt());
                
                if (o.getCilin() > 900 && o.getCilin() < 1700) 
                {
                   o.setPgAnt(150.000);

                } else if(o.getCilin() >= 1700 && o.getCilin() < 2000) {
                    o.setPgAnt(200.000);
                } else {
                    o.setPgAnt(250.000);
                }
                o.setNumCelda(i+1);
            }
            return r;
    }
    public mio[] CalcularNuevoPago(mio[]r)
    {
        for (int i = 0; i < r.length; i++)
        {
            r[i].setPgAct(r[i].getPgAnt() * 1.23);
        }
        return r;
    }
    public void MostrarRegistros(mio[] r)
    {
        for (int i = 0; i < r.length; i++)
        {
            System.out.println("Marca: " + r[i].getMarca());
            System.out.println("Tipo de vehucilo: " + r[i].getTipo());
            System.out.println("Cilindraje: " + r[i].getCilin());
            System.out.println("Pago Anterior: " + r[i].getPgAnt());
            System.out.println("Pago actual: " + r[i].getPgAct());
            System.out.println("Numero de celda: " + r[i].getNumCelda());
            System.out.println("****************************************");

        }
    }
}
