import java.util.Scanner;

public class SumaDeMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int m = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int suma = sumaMatriz(matriz, 0, 0);
    }

    public static int sumaMatriz(int[][] mat, int i, int j){
        if (i == mat.length){
            return 0;
        }
        if (j == mat[i].length){
            return sumaMatriz(mat, i + 1, 0);
        }
        return mat[i][j] + sumaMatriz(mat, i, j + 1);
    }
}
