import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese una palabra o frase
        System.out.print("Por favor, ingresa una palabra o frase: ");
        String entrada = scanner.nextLine();
        
        // Llamamos a la función que cuenta las vocales
        int cantidadVocales = contarVocales(entrada);
        
        // Mostramos el resultado
        System.out.println("La cantidad de vocales en la entrada es: " + cantidadVocales);
        
        // Cerramos el scanner
        scanner.close();
    }

     // Método para contar las vocales en una cadena
     public static int contarVocales(String texto) {
        int contador = 0;
        // Convertimos el texto a minúsculas para facilitar la comparación
        texto = texto.toLowerCase();
        
        // Recorremos cada carácter del texto
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            // Verificamos si el carácter es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++; // Aumentamos el contador si encontramos una vocal
            }
        }
        return contador; // Devolvemos el total de vocales encontradas
    }

}   