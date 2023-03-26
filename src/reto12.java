import java.util.Scanner;

public class reto12 {
    public static void main(String[] args) {
        //Declarar matrices de 4 x 4 para un total de tamaño 16. 
        int f = 4, c = 4;       
        String nombreProd[][] = new String [f][c];
        int precioProd[][] = new int [f][c];        

        Scanner input = new Scanner(System.in);
        

        System.out.println("====== MÁQUINA EXPENDORA ========");


        for (int i = 0; i < nombreProd.length; i++) {
            for (int j = 0; j < precioProd.length; j++) {
                System.out.println("Digite el nombre del producto en la posición "+i+j);
                nombreProd[i][j] = input.next();
                System.out.println("Digite el precio del producto "+nombreProd[i][j]+" (sin puntos ni coma)");
                precioProd[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("============ CATALOGO DE PRODUCTOS ============");

        for (int i = 0; i < c; i++) {            
            for (int j = 0; j < f; j++) {
                System.out.print("Código "+i+j+"\t");                                
            }            
            System.out.println();
            for (int j = 0; j < f; j++) {
                System.out.print("Nombre "+nombreProd[i][j]+"\t");
            } 
            System.out.println();
            for (int j = 0; j < f; j++) {
                System.out.print("Precio "+precioProd[i][j]+"\t");
            }                           
            System.out.println("\n=======================================");
        }

        input.close();
    }
}
