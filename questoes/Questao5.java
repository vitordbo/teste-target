package questoes;
/*
 * 5) Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua 
    preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua palavra para ser invertida: ");
            String palavra = scanner.nextLine();
            
            System.out.println("-------------");
            System.out.println("Palavra normal = " + palavra);
            System.out.println("Palavra invertida " + inverteString(palavra));
        }
    }
   
    public static String inverteString(String palavra) {
        char[] arrayPalavra = palavra.toCharArray();
        char[] invert = new char[palavra.length()];
    
        // Loop para percorrer a string original
        for (int i = 0; i < palavra.length(); i++) {
            char c = arrayPalavra[i];
            // Loop para armazenar os caracteres invertidos no novo array
            invert[palavra.length() - i - 1] = c;
        }
    
        String invertida = new String(invert);
        return invertida;
    }
    
}

