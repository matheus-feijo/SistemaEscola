/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void apresentar(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RG: "+this.getRg());
        System.out.println("Data de nascimento: "+this.getDataNascimento());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Especialidade: "+this.getEspecialidade());
    }
}
