package br.senai.sp.jandira.ds1t.imc_academia;

import br.senai.sp.jandira.ds1t.imc_academia.model.Aluno;

public class ImcApp {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("                  --> INICIANDO O PROJETO  <--                          ");
        System.out.println("------------------------------------------------------------------------");


        Aluno imc= new Aluno();
        imc.receberDadosDoAluno();
    }
}
