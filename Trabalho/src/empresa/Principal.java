package empresa;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource") //para cancelar os avisos de scan aberto do Eclipse
		Scanner scan = new Scanner(System.in);
		int menu;
		Cofrinho cofre = new Cofrinho();
		
		do {
			System.out.println("\nCOFRINHO:\n1- Adicionar Moeda\n2- Remover Moeda\n3- Listar Moedas\n4- Total Convertido\n0- Encerrar Programa");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cofre.adicionarMoeda();
				break;
			case 2:
				cofre.removerMoeda();
				break;
			case 3:
				cofre.listagemMoedas();
				break;
			case 4:
				cofre.totalConvertido();
				System.out.printf("Valor total convertido para reais: R$%.2f\n", cofre.total);
				break;
			case 0:
				break;
			}
		}
		while (menu!=0);
		
	}

}
