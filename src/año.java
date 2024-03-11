import java.util.Scanner;
import javax.management.RuntimeErrorException;

public class año {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu año de nacimiento");
        int año = sc.nextInt();
        calcularEdad(año);
        try{
            calcularAño(año);
        }catch(Exception ex){
            System.out.println("Tu edad es invalida");
            return;
        }
    }

    //Unchecked
    public static int calcularEdad(int año){
        int edad = 2024 - año;
        if(edad <= 0){
            throw new RuntimeException("ErrorEsNegativo");
        }
        System.out.println("Tu edad es:" + edad);
        return edad;
    }

    //Checked
    public static int calcularAño(int año) throws Exception{
        int edad = 2024 - año;
        if(edad <= 0){
            throw new RuntimeException("El numero es negativo");
        }
        System.out.println("Tu edad es:" + edad);
        return edad;
    }
}
