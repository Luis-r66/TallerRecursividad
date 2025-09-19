import java.util.Scanner;

public class SumaSucesiva {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();
        int multiplicacion = multiplicarSuma(a, b);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }

    public static int multiplicarSuma(int a, int b){
        if (b == 0){
            return 0;
        }else {
            return a + multiplicarSuma(a, b - 1);
        }
    }
}
