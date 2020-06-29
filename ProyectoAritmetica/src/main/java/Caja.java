
public class Caja {
    //atributos

    int alto;
    int profundo;
    int ancho;
//constructor vacio
    public Caja() {

    }
    public Caja(int alto,int ancho,int profundo){
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo;
        System.out.println("calculando volumen");
    }
//metodo
   public int volumen(){
       return (this.alto*this.ancho*this.profundo);
   }
}
