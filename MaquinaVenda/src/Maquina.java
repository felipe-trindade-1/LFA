import java.util.Scanner;

public class Maquina {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor = 0;
		double total = 0;

		Scanner input = new Scanner(System.in);
		
		while (total < 0.45) {
			System.out.printf("Insira o valor da Moeda: ", "%.2f");
			valor = input.nextDouble();
			if (valor == 0.10 || valor == 0.25) {
				total += valor;
			} else {
				System.out.println(">> Valor da moeda n�o � valido ! <<");
			}
			if (total >= 0.45) {
				System.out.printf("Voc� inseriu %.2f - Retire a sua Coca-Cola !", total);
			}
		}
	}

}
