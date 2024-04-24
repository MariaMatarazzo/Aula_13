package Lista_de_exercicios_Aula11;

import java.util.Scanner;

public class While_Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int impar = 0, par = 0, num,soma=0;
		int i = 1;
		
		while (i<=10) {
			
		 System.out.print("Informe o numero desejado >>>>>"
		 		+ " "+i+" número: ");
		 
		num = ler.nextInt();
		
		soma= soma+num;
		
		if (num%2==0)
		   par = par + num ;
		else
		impar = impar +num; 
		System.out.println("As somas das notas são:  " + soma);
	
		i++;
		}
		
		System.out.println("Quantidade de par: "+par ); System.out.println("Quantidade de impar: "+impar );
	

	



	}

}
