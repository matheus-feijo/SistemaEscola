/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

/**
 *
 * @author Pichau
 */
public class Aluno extends Pessoa{
    private String rga;
    private String curso;
    private int semestre;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void apresentar(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RG: "+this.getRg());
        System.out.println("Data de nascimento: "+this.getDataNascimento());
        System.out.println("RGA: "+this.getRga());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Semestre: "+this.getSemestre());
        
    }
    
    
 
    
}
