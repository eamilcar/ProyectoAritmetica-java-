
public class PruebaCaja {

    public static void main(String[] args) {
        
        int ancho=3;
        int alto=2;
        int profundo=6;
        //instancia a la clase Caja
        Caja caja=new Caja(ancho,alto,profundo);
        System.out.println("El volumen de la caja es: "+ caja.volumen());
    }
}
