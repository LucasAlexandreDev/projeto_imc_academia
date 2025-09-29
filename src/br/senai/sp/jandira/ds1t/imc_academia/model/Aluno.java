package br.senai.sp.jandira.ds1t.imc_academia.model;

import java.util.Scanner;

public class Aluno {
    String nomeAluno;
    String statusDoAluno;
    String recomendacaoParaOAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imcFinal;


        public void receberDadosDoAluno(){
            Scanner leitor= new Scanner(System.in);
            System.out.print("Qual é o nome do aluno(a): ");
            nomeAluno= leitor.nextLine();

            System.out.print("Qual é o peso do(a) " +nomeAluno+ ": ");
            pesoDoAluno= leitor.nextDouble();

            System.out.print("Qual é a altura do(a) " +nomeAluno+ ": ");
            alturaDoAluno= leitor.nextDouble();

            calcularImcDoAluno();
        }

        public void calcularImcDoAluno(){
            double resultadoAltura= (alturaDoAluno * alturaDoAluno);
            imcFinal= pesoDoAluno / resultadoAltura;

            classificarPesoDoAluno();
        }

        public void classificarPesoDoAluno(){
            if (imcFinal <18.6){
                statusDoAluno= "ABAIXO DO PESO";
                recomendacaoParaOAluno = "GANHO DE MASSA MUSCULAR";

            }else if (imcFinal >=18.6 && imcFinal <25.0){
                statusDoAluno= "PESO IDEAL";
                recomendacaoParaOAluno= "CONTINUE O QUE ESTÁ FAZENDO, PARABÉNS";

            } else if (imcFinal >=25.0 && imcFinal <30.0) {
                statusDoAluno= "LEVEMENTE ACIMA DO PESO";
                recomendacaoParaOAluno= "MELHORE A ALIMENTAÇÃO E SE HIDRATE-SE COM MAIS FREQUÊNCIA";
                
            } else if (imcFinal >=30.0 && imcFinal <35.0){
                statusDoAluno= "OBESIDADE GRAU I";
                recomendacaoParaOAluno= "PERDA DE MASSA MUSCULAR";

            }else if (imcFinal >=35.0 && imcFinal <40.0) {
                statusDoAluno= "OBESIDADE GRAU II (SEVERA)";
                recomendacaoParaOAluno= "TOME CUIDADO, PREOCURE UM ESPECIALISTA";

            }else{
                statusDoAluno= "OBESIDADE GRAU III (MÓRBIDA)";
                recomendacaoParaOAluno= "ESTÁ CORRENDO RISCO DE VIDA, PREOCURE UM ESPECIALISTA IMEDIATAMENTE";
            }

            exibirResutadoFinalImcXStatusPeso();
        }

        public void exibirResutadoFinalImcXStatusPeso(){
            String imcComDoisDecimais= String.format("%.2f", imcFinal);

            System.out.println();
            System.out.println("------------------------- RESULTADO DO ALUNO(A) ------------------------ ");
            System.out.println("Aluno(a): " +nomeAluno);
            System.out.println("IMC final do(a)" +nomeAluno+ ": " +imcComDoisDecimais);
            System.out.println("Status: " +statusDoAluno);
            System.out.println("Recomendação: " +recomendacaoParaOAluno);
            System.out.println("------------------------------------------------------------------------");
        }

}
