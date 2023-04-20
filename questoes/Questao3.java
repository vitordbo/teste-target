package questoes;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/* 
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
 faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
Estes dias devem ser ignorados no cálculo da média;
*/

// mais fácil usar o PowerBi hehe
// tive que pesquisar, só tinha trabalhado lendo e escrevendo em txt
// usei a biblioteca json-simple (https://code.google.com/archive/p/json-simple/)
// https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-json-em-java/27663

public class Questao3 { 
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();

        // Lê o arquivo JSON como um array
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("D:/Users/vitor/git/teste-target/arquivos/dados.json"));

        // Cria uma lista para armazenar os valores de faturamento diário
        List<Double> faturamentoDiario = new ArrayList<>();
        
        // Itera sobre os objetos do array para obter os valores de faturamento
        for (Object obj : jsonArray) {
            JSONObject jsonObj = (JSONObject) obj;
            Double valor = Double.parseDouble(jsonObj.get("valor").toString());
            faturamentoDiario.add(valor);
        }

        // Convertendo a lista em um vetor
        Double[] faturamentoVetor = faturamentoDiario.toArray(new Double[faturamentoDiario.size()]);

        // O menor valor de faturamento ocorrido em um dia do mês
        double menorValor = Double.MAX_VALUE;
        for (double valor : faturamentoVetor) {
            if (valor < menorValor && valor != 0) { // não cair nos dias com menor faturamento = 0
                menorValor = valor;
            }
        }
        System.out.println("----------");
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês = " + menorValor);

        // O maior valor de faturamento ocorrido em um dia do mês
        double maiorValor = Double.MIN_VALUE;
        for (double valor : faturamentoVetor) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        System.out.println("----------");
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês = " + maiorValor);

        //Podem existir dias sem faturamento, como nos finais de semana e feriados. 
        //Estes dias devem ser ignorados no cálculo da média;
        double total = 0;
        int count = 0;
        for (double valor : faturamentoVetor) {
            if (valor > 0) { // Ignora dias com faturamento = 0
                total += valor;
                count++;
            }
        }
        float media = (float) (total / count);

        System.out.println("----------");
        System.out.println("A média do valor de faturamento = " + media);

        // Número de dias no mês em que o valor de faturamento diário foi superior à média mensal
        count = 0;
        for (double valor : faturamentoVetor) {
            if (valor > media) {
                count++;
            }
        }
        System.out.println("----------");
        System.out.println("Número de dias no mês em que o valor de faturamento diário " +
        "foi superior à média mensal = " + count);
    }
}



    

