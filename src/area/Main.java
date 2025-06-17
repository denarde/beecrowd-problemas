package area;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e 
um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.


 */
public class Main {

    public static String format(Object in){
        return String.format("%.3f",in);
    }
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String input;

        Double A, B, C;

        input = br.readLine();

        String[] inputs = input.split(" ");

        A = Double.parseDouble(inputs[0]);
        B = Double.parseDouble(inputs[1]);
        C = Double.parseDouble(inputs[2]);

        //a) a área do triângulo retângulo que tem A por base e C por altura.
        var triangulo = (A * C) / 2;

        System.out.println("TRIANGULO: " + format(triangulo));

        //b) a área do círculo de raio C. (pi = 3.14159)

        var circulo = Math.pow(C, 2) * 3.14159;

        System.out.println("CIRCULO: " + format(circulo));

        //c) a área do trapézio que tem A e B por bases e C por altura.
        
        var trapezio = ((A + B) * C) / 2;

        System.out.println("TRAPEZIO: "+ format(trapezio));

        //d) a área do quadrado que tem lado B.
        
        var quadrado = B * B;

        System.out.println("QUADRADO: " + format(quadrado));

        //e) a área do retângulo que tem lados A e B.

        var retangulo = A * B;

        System.out.println("RETANGULO: " + format(retangulo));

    }
 
}