public class calculadora{
    private double num1;
    private double num2;
    
    public calculadora(){

    }

    public calculadora(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public static double suma(double n1, double n2){
        double resultado = n1 + n2;
        System.out.println(resultado);
        return resultado;
    }

    public static double resta(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println(resultado);
        return resultado;
    }

    public static double multiplicar(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println(resultado);
        return resultado;
    }

    public static double dividir(double n1, double n2){
        double resultado;
        if(n1 == 0 && n2 == 0){
            throw new RuntimeException("No se puede divir 0 entre 0");
        }else{
            resultado = n1 / n2;
        }
        System.out.println(resultado);
        return resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Checked y Unchecked
    
}