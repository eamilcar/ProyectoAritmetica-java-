
public class Aritmetica {

    ///atributos de la clase
    //asigna valor de "0
    int a;
    int b;

    //constructor vacio
    public Aritmetica() {
        System.out.println("ejecutando constructor vacio");
    }

    //no regresa ningun tipo 
    public Aritmetica(int a, int b) {
        //inicializar valores de los atributos con los argumentos definida
        //this se asigna a cada atributo
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }

    //metodo
    public int sumar() {
        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;
    }

    public int dividir() {
        return this.a / this.b;
    }
}
