import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        System.out.println("Número invertido:" + invertido(numero));
    }
    static int inv = 0;
    static int invertido(int numero) {
        if (numero == 0){
            return inv;
        }else {
            int ultimo = numero % 10;
            inv = inv * 10 + ultimo;
            return invertido(numero / 10);
        }
    }
}
