import java.util.Scanner;

public class reto11 {
    public static void main(String[] args) {
        // Declarar la matriz de palabras
        String[][] matriz = new String[3][3]; 
        // Declarando las variables para conocer cuantas veces se repiten.
        int repeticiones;

        //Instanciar clases
        Scanner input = new Scanner(System.in);

        // Pedir al usuario las palabras para llenar la matriz
        System.out.println("====== BIENVENIDO AL JUEGO DE CONCENTRACIÓN ======");
        System.out.println("Por favor, digite en cada número una palabra.");
        for (int i = 0; i < 9; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            matriz[i/3][i%3] = input.next();           
        }    

        // Mostrar la matriz del juego
        System.out.println("Juego de concentración:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrar las palabras que se repiten   
        // Se usan operadores aritmeticos para poder aaceder a los elementos de la matriz
        // El operador "/" se usa para las filas y el operador "%" se usa para las columnas
        for (int i = 0; i < 9; i++) {
            repeticiones = 0;
            for (int j = i+1; j < 9; j++) {
                if (matriz[i/3][i%3].equals(matriz[j/3][j%3])) {
                    repeticiones++;
                }
            }
            if (repeticiones > 0) {
                System.out.println("La palabra " + matriz[i/3][i%3] + " se repite " + (repeticiones+1) + " veces.");
            }
        }

        System.out.println("El programa ha finalizado.");

        input.close();                                                                                                                                                                                                               
    }
}