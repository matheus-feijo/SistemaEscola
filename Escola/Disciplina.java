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
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private boolean matricula;
    private int semestre;
    private int qntAlunos;
    
   

    public Disciplina(int qntAlunos) {
        this.qntAlunos = qntAlunos;
    }
    
    public void matricula(Aluno aluno){
        if(aluno.getSemestre()>= this.semestre){
            setMatricula(true);
        }else{
            setMatricula(false);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if(professor.getEspecialidade().equals(this.nome)){
            this.professor = professor;
        }else{
            System.out.println("Professor "+professor.getNome()+" nao tem especialidade para ministrar essa disciplina");
        }
        
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public int getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(int qntAlunos) {
        if(isMatricula() == true){
            this.qntAlunos = qntAlunos;
        }
         
    }

   public void apresentar(){
       System.out.println("Disciplina: "+this.nome);
       System.out.println("Carga horaria: "+this.cargaHoraria);
       System.out.println("Professor: "+this.professor.getNome());
       System.out.println("Quantidade de alunos: "+this.qntAlunos);
   }
    
    
    
    

    
}
