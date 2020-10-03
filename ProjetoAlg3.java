
package projeto.alg.pkg3;

import Escola.Aluno;
import Escola.Pessoa;
import Escola.Disciplina;
import Escola.Professor;
import java.util.Scanner;



public class ProjetoAlg3 {


    public static void main(String[] args) {
          
        
        Aluno a = new Aluno();
       
        a.setNome("Matheus Feijo");
        a.setCpf("060368851-99");
        a.setDataNascimento("25/06/2001");
        a.setCurso("Ciencia da computacao");
        a.setRg("22343-9");
        a.setRga("201911310035");
        a.setTelefone("(65)99817-2001");
        a.setSemestre(3); 
        a.apresentar();
        System.out.println(" - - - - - - - -  - -");
        
        Professor p = new Professor();
        
        p.setNome("Lizias");
        p.setCpf("060455231-07");
        p.setDataNascimento("20/09/1980");
        p.setRg("230589-3");
        p.setEspecialidade("Inteligencia Artificial");
        p.setSalario(6500);
        p.setTelefone("(65) 99277-2080");
        p.apresentar();
        System.out.println("  - - - - - - - - - - -  -");
        
        Disciplina d1 = new Disciplina(0);
        
        d1.setNome("Inteligencia Artificial");
        d1.setCargaHoraria(60);
        d1.setProfessor(p);
        d1.matricula(a);
        d1.apresentar();
        System.out.println(" - - - -- - - - - -- - -");
        
        
        
    }
        
}
