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
public class Professor extends Pessoa {
    //private String especialidade;
    private double salario;
    private Materia materia;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public void apresentar(){
        System.out.println("\tDADOS DO PROFESSOR");
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Salario: "+this.salario);
        System.out.println("Telefone: "+this.getTelefone());
        System.out.println("Especialidade: "+this.materia.getNome());
        System.out.println("- - - - -- - -- - -- -");
        System.out.println(" ");
        
    }
    
    
   
    
    
}
