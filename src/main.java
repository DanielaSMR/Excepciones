import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;
        calculadora funcion = new calculadora();
        do{
        System.out.println("Escribe los numeros que quieres utilizar(en orden)");
        System.out.println("Escribe num1");
        int num1 = sc.nextInt();
        System.out.println("Escribe num2");
        int num2 = sc.nextInt();
        System.out.println("Elige una opcion" + "\n1-Sumar"
        + "\n2-Resta" + "\n3-Multiplicacion" + "\n4-Division");
        opciones = sc.nextInt();

        switch (opciones) {
            case 1:
                int s = calculadora.suma(num1, num2);
                break;
            case 2:
                int r = calculadora.resta(num1, num2);
                break;
            case 3:
                int m = calculadora.multiplicar(num1, num2);
                break;
            case 4:
                double d = calculadora.dividir(num1, num2);
            default:
                System.out.println("Adios...");
                break;
        }
        }while(opciones != 5);
    }

    //Checked se utiliza en excepciones que no son debiado a un error propio del programa
}
