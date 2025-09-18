import java.util.Scanner;

public class SumatoriaFracciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        double resultado = sumatoria(numero);
        System.out.println("La sumatoria desde 1 + 1/2 + ... 1/" + numero + " es " + resultado);
    }
    public static double sumatoria(int n){
        if (n == 1){
            return 1.0;
        }else {
            return 1.0 / n + sumatoria(n - 1);
        }
    }
}
