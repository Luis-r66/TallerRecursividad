import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        int resultado = Potencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);

    }

    public static int Potencia(int base, int exponente){
        if (exponente == 0){
            return 1;
        }else {
            return base * Potencia(base, exponente - 1);
        }
    }
}
