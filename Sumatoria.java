import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        int resultado = sumatoria(numero);
        System.out.println("La sumatoria desde 1 hasta " + numero + " es " + resultado);
    }
    public static int sumatoria(int n){
        if (n == 1){
            return 1;
        }else {
            return n + sumatoria(n - 1);
        }
    }
}
