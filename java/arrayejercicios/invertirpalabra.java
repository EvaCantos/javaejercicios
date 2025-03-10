import java.util.Scanner;

public class invertirpalabra {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una palabra
        System.out.print("Por favor, ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        
        // Mostrar la palabra invertida
        System.out.println("La palabra invertida es: " + palabraInvertida);
        
        // Cerrar el scanner
        scanner.close();
    }
}