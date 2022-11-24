package br.com.alura;
import java.util.HashMap;
import java.util.Map;
public class ExercicioMap {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
//		pessoas.forEach((Integer idade, String nome) -> {
//			System.out.println("Key/Idade: " + idade + ", Value/Nome: " + nome);
//		});
		
//		pessoas.keySet().forEach((idade) -> {
//			System.out.println("Key/Idade: " + idade);
//		});
		
		pessoas.keySet().forEach((idade) -> {
			System.out.println("Nome/valor: " + pessoas.get(idade));
		});

	}

}
