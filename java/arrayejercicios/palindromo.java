import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra
        System.out.print("reverso: ");
        String palabra = scanner.nextLine();

        // Convertir la palabra a minúsculas para evitar problemas de mayúsculas/minúsculas
        String palabraMinuscula = palabra.toLowerCase();

        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabraMinuscula).reverse().toString();

         // Verificar si es un palíndromo
         if (palabraMinuscula.equals(palabraInvertida)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
        
        scanner.close();
    }
}
