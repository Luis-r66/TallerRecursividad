public class SumaMatrizDos {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int suma = sumaMatrizRecursiva(matriz, 0, 0);
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    public static int sumaMatrizRecursiva(int[][] mat, int i, int j) {
        if (i == mat.length) {
            return 0;
        }
        if (j == mat[i].length) {
            return sumaMatrizRecursiva(mat, i + 1, 0);
        }
        return mat[i][j] + sumaMatrizRecursiva(mat, i, j + 1);
    }
}

