import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        //Declaración de variables.
        int n;
        //Creación de los vectores.
        int numero [];

        //Creación del objeto que instancia la clase Scanner
        Scanner input = new Scanner(System.in);
                
        //Solicitud del número de cantidades a ingresar
        System.out.println("Bienvenido al programa que te ayuda a saber si un número es digito de dos.");
        System.out.println("Digite la cantidad de números que desea ingresar.");
        n = input.nextInt();
        numero = new int [n];

        //Operaciones
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el número de la posición "+(i+1));
            numero[i] = input.nextInt();
        }

        System.out.println("=================");

        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println((i+1)+". "+numero[i]+" si es múltiplo de dos.");
            } else {
                System.out.println((i+1)+". "+numero[i]+" no es múltiplo de dos.");
            }
        }

        System.out.println("El programa ha terminado");

        input.close();    
    }    
}