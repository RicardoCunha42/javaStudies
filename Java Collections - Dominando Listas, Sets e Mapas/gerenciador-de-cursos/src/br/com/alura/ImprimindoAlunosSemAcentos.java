package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
	
	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");    
        
        int size = alunos.size();
        
        System.out.println(size);
        
        boolean adicionou = alunos.add("Pedro");
        size = alunos.size();
        System.out.println(size);
        System.out.println("Adicionou? " + adicionou);

       alunos.forEach(aluno -> {
    	   System.out.println(aluno);
       });
    }
}
