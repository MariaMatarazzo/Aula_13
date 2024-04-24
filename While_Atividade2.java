package Lista_de_exercicios_Aula11;

import java.util.Scanner;

public class While_Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double numero, soma=0, media;
		int i = 1;
		

		while(i <=5) {
			System.out.print(">>>> Insira a nota: ");
			numero = ler.nextInt();
			
			soma= soma+numero;
			i ++;
		}
			System.out.println("As somas das notas são:  " + soma);
			System.out.println(" ");
		

		media = (soma)/5;
		System.out.println("A media do aluno é de: " + media);

		ler.close();


	}

}
