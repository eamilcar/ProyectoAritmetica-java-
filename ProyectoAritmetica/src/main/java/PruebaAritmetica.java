
public class PruebaAritmetica {

    public static void main(String[] args) {
        //variables locales
        int operandoA = 6;
        int operandoB = 2;

        //creamos un objeto de la clase aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        //imprimimos el resultado de la suma    
        System.out.println("Resultado de la suma "+ objeto1.sumar());

        //imprimir resta
        System.out.println("resultado de la resta = " +  objeto1.restar());
        
        //imprimir resutaldo de la multiplicacion
        System.out.println("resultado de la multiplicacion = " + objeto1.multiplicar());
        
        //imprimir resultado division
        System.out.println("resultado de la division = " + objeto1.dividir());
        
    }

}
