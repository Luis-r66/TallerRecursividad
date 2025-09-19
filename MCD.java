import java.util.Scanner;

public class MCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número(M): ");
        int M = sc.nextInt();
        System.out.println("Ingrese el segundo número(N): ");
        int N = sc.nextInt();
        int resultado = mcd(M, N);
        System.out.println("El MCD de " + M + " y " + N + " es: " + resultado);
    }

    public static int mcd(int M, int N){
        if (N == 0){
            return M;
        }else {
            return mcd(N, M % N);
        }
    }
}
