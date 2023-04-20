package questoes;
/* 
Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?
*/

public class Questao1 {
    public static void main(String[] args) {
        
        int indice = 13;
        int soma = 0; 
        int K = 0;

        while(K < indice){
            K = K + 1;
            soma = soma + K;
        } 
        
        System.out.println("soma = " + soma);
    }

}