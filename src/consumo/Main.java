package consumo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real 
Y representando o total de combustível gasto, com um dígito após o ponto decimal.

500
35.0

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

14.286 km/l

 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            var distância = Integer.parseInt(br.readLine());
            var gasto = Double.parseDouble(br.readLine());
            var consumo = distância / gasto;
            System.out.println(String.format("%.3f", consumo) + " km/l");

        }
 
    }
 
}
