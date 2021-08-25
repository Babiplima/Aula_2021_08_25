package br.com.zup;

import java.util.Scanner;

public class Exercicio_Aula_2021_08_25_Scanner {

    public static void main(String[] args) {

      //Instanciar o scanner

                Scanner obj_leitor = new Scanner(System.in);

      //Declarando em metros

                float metro;

        //Recebendo os valores em metro

        System.out.println("Vamos calcular os metros para centímetros");

        System.out.println( "Digite quantos metros");

        metro = obj_leitor.nextFloat();

                System.out.println("Temos " + metro + " metros");

                //Declarando para transformar para centímetros

                float centimetros = metro * 100;

                // Apresentando o resultado

                System.out.println( "O valor do metro em centímetro são " + centimetros + " cm");
    }
}
