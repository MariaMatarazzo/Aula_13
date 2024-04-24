package Lista_de_exercicios_Aula11;
import java.util.Scanner;
public class While_parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();
		
		while (numero % 2 != 0) {
			System.out.println("O número digitado não é par. Digite novamente: ");

			numero = ler.nextInt();

			}

			System.out.println("O número " + numero + " é par!");

			ler.close();

			
		}

	}


