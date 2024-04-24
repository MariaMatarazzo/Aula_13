package Lista_de_exercicios_Aula11;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double numero, soma=0, media;

		for(int i=0; i <= 4; i++) {
			System.out.print(">>>> Insira a nota: ");
			numero = ler.nextInt();
			
			soma= soma+numero;
			System.out.println("As somas das notas são:  " + soma);
			System.out.println(" ");
		}

		media = (soma)/5;
		System.out.println("A media do aluno é de: " + media);

		ler.close();


	}

}
