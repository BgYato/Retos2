import java.util.Scanner;

public class reto10 {
    public static void main(String[] args) {        
        //Creación de las variables        
        String participante [], clasNombre;
        int tiempo [];
        int n, clasTiempo, t;

        //Instanciando clases
        Scanner input = new Scanner(System.in);
        
        //Solicitando los datos
        System.out.println("Bienvenido a la competencia de natación.");
        System.out.println("* Digite la cantidad de participantes");
        n = input.nextInt();

        //Declarando algunas variables
        participante = new String [n];
        tiempo = new int [n];          

        for (int i = 0; i < n; i++) {
            System.out.println("===================");
            System.out.println("Digite el nombre del participante 0"+(i+1));
            participante[i] = input.next();
            System.out.println("Digite el tiempo (en segundos) del participante "+participante[i]);
            tiempo[i] = input.nextInt();

        }

        // Mostrar los nombres y tiempos de los competidores
        System.out.println("TABLA DE RESULTADOS");
        System.out.println("Competidor\tTiempo (segundos)");
        for (int i = 0; i < n; i++) {
            System.out.println(participante[i] + "\t\t" + tiempo[i]);
        }        

        // Ordenar los tiempos de menor a mayor
        // Acá se usa el algoritmo de selección 
        for (int i = 0; i < n - 1; i++) {
            t = i;
            for (int j = i+1; j < n; j++) {
                if (tiempo[j] < tiempo[t]) {
                    t = j;
                }
            }

            clasTiempo = tiempo[t];
            tiempo[t] = tiempo[i];
            tiempo[i] = clasTiempo;
            
            clasNombre = participante[t];
            participante[t] = participante[i];
            participante[i] = clasNombre;
        }
        
        // Mostrar los tres primeros ganadores
        System.out.println("Tras analizar los datos recolectados, tenemos los tres primeros ganadores.");
        System.out.println("Puesto\tCompetidor\tTiempo");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ".\t" + participante[i] + "\t" + tiempo[i] + " segundos");
        }       
        input.close();
    }
}
