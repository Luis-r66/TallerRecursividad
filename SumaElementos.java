import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        System.out.println("Ingrese los elementos del vector: ");
        for (int i = 0; i < n; i++){
            vector[i] = sc.nextInt();
        }

        int suma = sumaVector(vector, 0);
        System.out.println("La suma de elementos del vector es: " + suma);
    }

    public static int sumaVector(int[] vec, int i){
        if (i == vec.length){
            return 0;
        }else {
            return vec[i] + sumaVector(vec, i + 1);
        }
    }
}
