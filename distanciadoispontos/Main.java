package distanciadoispontos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
/**
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
mostrando 4 casas decimais, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto 
flutuante x2 y2.

1.0 7.0
5.0 9.0

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.

4.4721
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
        String[] inputs1 = buffer.readLine().split(" ");
        String[] inputs2 = buffer.readLine().split(" ");
        
        double x1, x2, y1, y2;

        x1 = Double.parseDouble(inputs1[0]);
        y1 = Double.parseDouble(inputs1[1]);

        x2 =  Double.parseDouble(inputs2[0]);
        y2 =  Double.parseDouble(inputs2[1]);

        var result = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        System.out.println(String.format("%.4f", result));

       }
 
    }
 
}
