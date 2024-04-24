package Lista_de_exercicios_Aula11;
import java.util.Scanner;
public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int impar = 0, par = 0, num;
		
		for (int i=1; i<=10; i++) {
		 System.out.print("Informe o numero desejado>>>>>"
		 		+ " "+i+" número: ");
		num = ler.nextInt();
		
		if (num%2==0)
		   par = par + 1 ;
		else
		impar = impar +1;  
		}
		System.out.println("Quantidade de par: "+par ); System.out.println("Quantidade de impar: "+impar );
	

	

	}
}
