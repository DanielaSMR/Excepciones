import java.util.Scanner;
import javax.management.RuntimeErrorException;

public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu year de nacimiento");
        int year = sc.nextInt();
        calcularEdad(year);
        try{
            calcularyear(year);
        }catch(Exception ex){
            System.out.println("Tu edad es invalida");
            return;
        }
    }

    //Unchecked
    public static int calcularEdad(int year){
        int edad = 2024 - year;
        if(edad <= 0){
            throw new RuntimeException("ErrorEsNegativo");
        }
        System.out.println("Tu edad es:" + edad);
        return edad;
    }

    //Checked
    public static int calcularyear(int year) throws Exception{
        int edad = 2024 - year;
        if(edad <= 0){
            throw new RuntimeException("El numero es negativo");
        }
        System.out.println("Tu edad es:" + edad);
        return edad;
    }
}
