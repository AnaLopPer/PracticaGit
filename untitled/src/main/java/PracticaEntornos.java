import java.util.Scanner;
import java.time.LocalDateTime;
public class PracticaEntornos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu año de nacimiento:");
        int anyo = sc.nextInt();

        LocalDateTime fechaActual = LocalDateTime.now();
        int anyoActual = fechaActual.getYear();
        System.out.println("Año actual: "+anyoActual);
        int edad = anyoActual - anyo;
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
