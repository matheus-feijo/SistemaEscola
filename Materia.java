/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEscolar;

/**
 *
 * @author Pichau
 */
public class Materia {
    
    private String nome;
    private Turma turma;
    private Aluno aluno;
    private Notas[] notas = new Notas[3];

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    
    public Notas[] getNotas() {
        return notas;
    }

    public void setNotas(Notas[] notas) {
        this.notas = notas;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void apresentarMaterias(){
        System.out.println(this.nome);
    }
    
}
