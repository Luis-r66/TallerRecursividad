import java.util.Scanner;

public class FactorialRecursivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero+ " es " + resultado);

    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
