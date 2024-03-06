public class calculadora{
    private int num1;
    private int num2;
    
    public calculadora(){

    }

    public calculadora(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public static int suma(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public static int resta(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }

    public static double multiplicar(int n1, int n2) throws Exception{
        int resultado = n1 * n2;
        return resultado;
    }

    public static double dividir(int n1, int n2){
        if(n1 == 0 && n2 == 0){
            throw new RuntimeException("No se puede divir 0 entre 0");
        }

        return n1/n2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //Checked y Unchecked
    
}