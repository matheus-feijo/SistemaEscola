 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;


public class Turma{
    
    private String periodo;
    private int tamanho;

    public Turma(int tamanho) {
        this.tamanho = 0;
    }
    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tam) {
        this.tamanho = this.tamanho + tam;
    }
    
    

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
   
}
