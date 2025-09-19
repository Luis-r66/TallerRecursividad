import java.util.Scanner;

public class SumaDeDigitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();
        int suma = SumaDigitos(numero);
        System.out.println("La suma de los dígitos es: " + suma);
    }

    public static int SumaDigitos(int n){
        if (n == 0){
            return 0;
        }else {
            return (n % 10) + SumaDigitos(n / 10);
        }
    }
}
