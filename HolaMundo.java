import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
      System.out.println("Hola Cesar");
      System.out.printf("Mi nombre es: %s y tengo %d años ","juan jose", 17);
      var entrada = new Scanner(System.in);
      System.out.println("Ingrese un numero entero ");
      var entero = entrada.nextInt();
      entrada.close();
    }
}