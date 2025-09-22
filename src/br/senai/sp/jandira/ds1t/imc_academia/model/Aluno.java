package br.senai.sp.jandira.ds1t.imc_academia.model;

import java.util.Scanner;

public class Aluno {
    String nomeAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imcFinal;
    String classificacao;

        public void ReceberDadosDoAluno(){
            Scanner leitor= new Scanner(System.in);
            System.out.print("Qual é o nome do aluno(a):");
            nomeAluno= leitor.nextLine();

            System.out.print("Qual é o peso do(a) " +nomeAluno+ ":");
            pesoDoAluno= leitor.nextDouble();

            System.out.print("Qual é a altura do(a) " +nomeAluno+ ":");
            alturaDoAluno= leitor.nextDouble();

            calcularImcDoAluno();
        }

        public void calcularImcDoAluno(){
            double resultadoAltura= (alturaDoAluno * alturaDoAluno);
            imcFinal= pesoDoAluno / resultadoAltura;
        }

        public void classificacaoDoAluno(){
            if (imcFinal <= 18.5){
                classificacao= "BAIXO PESO";
            }else if (imcFinal >19-24.9){
                classificacao= "PESO IDEAL (PARABÉNS)";
            }else if (imcFinal >25.9-29.9){
                classificacao= "OBESIDADE GRAU I";
            }

            }

}
