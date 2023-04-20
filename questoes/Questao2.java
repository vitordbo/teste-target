package questoes;
import java.util.Scanner;

/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
 * sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 *
 *  IMPORTANTE:
 *  Esse número pode ser informado através de qualquer entrada de sua preferência ou 
 *  pode ser previamente definido no código;
 */

public class Questao2 {
    public static void main(String[] args) {   
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu número: ");
            int numero = scanner.nextInt();
            
            System.out.println("-------------");
            fib(numero);
        }
    }
   
    // codigo usando programação dinâmica => recentemente visto na aula de análise de algoritmos 
    public static int fib(int n){
        int[] f = new int[n + 1];
        
        f[0] = 0;
        f[1] =1;
        
        // duas anteriores
        System.out.println("Sequência = \n" + f[0] + "\n" + f[1]);
        
        for (int i = 2; i <=n; i++){
            System.out.println(f[i] = f[i-1] + f[i-2]); // exibindo a sequência 
            f[i] = f[i-1] + f[i-2];
        }

        System.out.println("-------------");
        
        // vendo ser pertence ou não a sequência
        if (pertenceFib(f, n)){ 
            System.out.println("Número = " + n + " pertence a sequência");
            return f[n];    
        }
        else{
            System.out.println("Número = " + n + " não pertence a sequência");
            return 0;
        }
    }

    // recebe o array e testa se o numero pertence
    public static boolean pertenceFib(int[] f, int n) {
        for (int i = 0; i < f.length; i++) {
            if (f[i] == n) {
                return true;
            }
        }
        return false;
    }
}
