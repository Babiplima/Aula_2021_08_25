package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Instanciar o scanner

        Scanner obj_leitor = new Scanner(System.in);

        //Notas do aluno
               float nota1;
               float nota2;
               float nota3;
               float nota4;
        //Recebendo os valores das notas

        System.out.println("Vamos calcular a média aritmética das notas para o aluno");

        System.out.println( "Digite a primeira nota do aluno ");
        nota1 = obj_leitor.nextFloat();

        System.out.println( "Digite a segunda nota do aluno ");
        nota2 = obj_leitor.nextFloat();

        System.out.println( "Digite a terceira nota do aluno ");
        nota3 = obj_leitor.nextFloat();

        System.out.println( "Digite a quarta nota do aluno ");
        nota4 = obj_leitor.nextFloat();

        // Operação da soma das notas
               float soma = nota1+nota2+nota3+nota4;

        //        // Operação de média aritmética

               float media = soma/4;
        //
        //        //Exibindo o resultado da média do aluno

               System.out.println("O resultado da média do aluno ao fim do 4º bimestre é " + soma);
    }
}
