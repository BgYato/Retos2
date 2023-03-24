import java.util.Scanner;

public class reto11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar la matriz de palabras y el arreglo para las posiciones
        String[][] matriz = new String[3][3];
        int[] posiciones = new int[9];

        // Pedir al usuario las palabras para llenar la matriz
        System.out.println("Ingrese las palabras para el juego de concentración:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            matriz[i/3][i%3] = input.next();
            posiciones[i] = i;
        }

        // Mezclar las posiciones de las palabras
        for (int i = 0; i < 9; i++) {
            int j = (int)(Math.random() * 9);
            int temp = posiciones[i];
            posiciones[i] = posiciones[j];
            posiciones[j] = temp;
        }

        // Crear la matriz del juego con las palabras mezcladas
        String[][] juego = new String[3][3];
        for (int i = 0; i < 9; i++) {
            juego[i/3][i%3] = matriz[posiciones[i]/3][posiciones[i]%3];
        }

        // Mostrar la matriz del juego
        System.out.println("Juego de concentración:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(juego[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrar las palabras que se repiten
        for (int i = 0; i < 9; i++) {
            int repeticiones = 0;
            for (int j = i+1; j < 9; j++) {
                if (juego[i/3][i%3].equals(juego[j/3][j%3])) {
                    repeticiones++;
                }
            }
            if (repeticiones > 0) {
                System.out.println("La palabra " + juego[i/3][i%3] + " se repite " + (repeticiones+1) + " veces.");
            }
        }

        input.close();                                                                                                                                                                                                               
    }
}