/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import SistemaEscolar.Aluno;
import SistemaEscolar.Materia;
import SistemaEscolar.Notas;
import SistemaEscolar.Professor;
import SistemaEscolar.Turma;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Pichau
 */
public class Escola {


    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        //DECLARAÇÃO DOS OBJETOS PARA O TESTE
        Aluno aluno = new Aluno();
        Materia mat = new Materia();
        Materia mat2 = new Materia();
        Notas notas = new Notas();
        Turma turma = new Turma();
      
        
        //EXEMPLO TESTE
        
        aluno.setNome("Matheus feijo");
        aluno.setCpf("060.368.851-99");
        aluno.setMensalidade(1650);
        aluno.setRga("201911310035");
        aluno.setTelefone("(65) 99817-2001");
        
        turma.setAluno(aluno);
        mat.setNome("Matematica");
        //mat.setNotas(notas);
     
        //turma.setMateria(mat);
        turma.setPeriodo("Matutino");
        turma.setNome("2 ano");

        aluno.setTurma(turma);
        mat.setTurma(turma);
        mat.setAluno(aluno);
   
        //TESTE
        mat2.setNome("Geografia");
        mat2.setTurma(turma);
        mat2.setAluno(aluno);
        mat2.apresentarMaterias();
        mat.apresentarMaterias();
       

        Professor prof = new Professor();
        
        prof.setNome("Lizias");
        prof.setCpf("054.854.788-00");
        prof.setMateria(mat);
        prof.setSalario(4500);
        prof.setTelefone("(65) 99277-2080");
        
        
        aluno.guardarArquivo();
        aluno.apresentar();
        prof.apresentar();
        
  
        
   
        
        
    }
    
}
