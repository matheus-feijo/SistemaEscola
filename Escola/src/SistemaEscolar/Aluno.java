/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEscolar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Aluno extends Pessoa {
    private String rga;
    private double mensalidade;
    private Turma turma;
    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void guardarArquivo() throws IOException{
        FileWriter arq = new FileWriter("C:\\Users\\Pichau\\Desktop\\Escola.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.printf("\tDADOS DO ALUNO\n");
        gravarArq.printf("Nome: "+this.getNome()+"\n");
        gravarArq.printf("CPF: "+this.getCpf()+"\n");
        gravarArq.printf("Data de Nascimento: "+this.getDataNascimento()+"\n");
        gravarArq.printf("RGA: "+this.getRga()+"\n");
        gravarArq.printf("Mensalidade: "+this.getMensalidade()+"\n");
        gravarArq.printf("Turno: "+this.turma.getPeriodo()+"\n");
        gravarArq.printf("Turma: "+this.turma.getNome()+"\n");
        gravarArq.printf(" - - - - - - - - - - - - -\n");
        gravarArq.printf(" \n");
        arq.close();
    }
    
    public void apresentar(){
        System.out.println("tDADOS DO ALUNO");
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Data de Nascimento: "+this.getDataNascimento());
        System.out.println("RGA: "+this.getRga());
        System.out.println("Mensalidade: "+this.getMensalidade());
        System.out.println("Turno: "+this.turma.getPeriodo());
        System.out.println("Turma: "+this.turma.getNome());
        System.out.println(" - - - - - - - - - - - - -");
        System.out.println(" ");
    }
    
    
    

}
