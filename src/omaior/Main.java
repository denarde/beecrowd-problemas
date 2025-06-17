package omaior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".


Entrada
7 14 106

Saida
106 eh o maior


*/
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] inputs = br.readLine().split(" ");

            int a, b, c; 
            a = Integer.parseInt(inputs[0]);
            b = Integer.parseInt(inputs[1]); 
            c = Integer.parseInt(inputs[2]);
            var maiorAB = (a+b+Math.abs(a-b))/2;
            var maior = maiorAB > c ? maiorAB : c;

            System.out.println(maior + " eh o maior");
            
        }
 
    }
 
}