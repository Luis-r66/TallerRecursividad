import java.util.Scanner;

public class CalcularCociente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        int cociente = cocienteDivision(dividendo, divisor);
        System.out.println("El cociente entero es: " + cociente);
    }

    public static int cocienteDivision(int dividendo, int divisor){
        if (dividendo < divisor){
            return 0;
        }else {
            return 1 + cocienteDivision(dividendo - divisor, divisor);
        }
    }
}
