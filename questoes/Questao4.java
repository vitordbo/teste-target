package questoes;
/* 
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação 
que cada estado teve dentro do valor total mensal da distribuidora.
*/
public class Questao4 {

    public static void main(String[] args) {
    
        double faturamentoSP = 67.83643;
        double faturamentoRJ = 36.67866;
        double faturamentoMG = 29.22988;
        double faturamentoES = 27.16548;
        double faturamentoOutros = 19.84953;
    
        double somaTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES 
        + faturamentoOutros;        

        System.out.println("Soma total = " + somaTotal);

        // tendo que 100% é = a soma total 
        // só dividir a faturamento individual pela soma
        // vezes 100 em todos para saida ficar melhor de ver
        double percentualSP = faturamentoSP / somaTotal; 
        System.out.println("Percentual de SP = " + percentualSP * 100 + " %");
        System.out.println("---------");

        double percentualRJ = faturamentoRJ / somaTotal; 
        System.out.println("Percentual do Rj = " + percentualRJ * 100 + " %");
        System.out.println("---------");

        double percentualMG = faturamentoMG / somaTotal; 
        System.out.println("Percentual de MG = " + percentualMG * 100 + " %");
        System.out.println("---------");

        double percentualES = faturamentoES / somaTotal; 
        System.out.println("Percentual do ES = " + percentualES * 100 + " %");
        System.out.println("---------");

        double percentualOutros = faturamentoOutros / somaTotal; 
        System.out.println("Percentual dos outros = " + percentualOutros * 100 + " %");
        System.out.println("---------");

        // provando que da os 100% 
        double percentual = percentualSP + percentualRJ + percentualMG + 
        percentualES + percentualOutros;
        System.out.println("Percentual total = " + percentual * 100);
    }
    
}
