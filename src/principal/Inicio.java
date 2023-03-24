package principal;
import salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //Creando un objeto -> instanciando clases de otro paquete
        Persona datos = new Persona();        

        //Creando variables.
        String resultado = "";
        //Invocando métodos del objeto persona.
        datos.pedirDatos();
        datos.mostrarPersona();
        /* EL CODIGO COMENTADO ABAJO HACE REFERENCIA AL RETO UNO */
        /* datos.calcularImc(); */


        /* EL CÓDIGO DE LA LÍNEA 19 A LA LÍNEA 27 HACE REFERENCIA AL RETO DOS */
        datos.calcularImc(resultado);
        resultado = datos.calcularImc(resultado);
        if (resultado == "PESOBAJO") {
            System.out.println("Los resultados del ICM dicen que usted posee un peso por debajo del ideal.");
        } else if (resultado == "PESOIDEAL") {
            System.out.println("Los resultados del ICM dicen que usted posee un peso ideal.");
        } else if (resultado == "SOBREPESO") {
            System.out.println("Los resultados del ICM dicen que usted posee sobre peso.");
        }
        
        System.out.println(resultado);

        datos.mayorEdad();
    }
}
