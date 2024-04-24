package Lista_de_exercicios_Aula11;

import java.util.Scanner;

public class While_atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int numero ;
		int i=1;
		
		System.out.print ("Informe o numero final desejado:  ");
		numero = ler.nextInt();
		
			while (i <= numero) {
			if (i% 2 != 0) {
			
			System.out.println("Numero impar do numero informado: "+i+ " ");
			}
			i++;

			ler.close();


		}

	}
}




	


