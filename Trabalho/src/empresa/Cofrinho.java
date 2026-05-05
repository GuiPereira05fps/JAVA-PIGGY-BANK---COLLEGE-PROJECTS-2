package empresa;

import java.util.Scanner;
import java.util.ArrayList;

public class Cofrinho {
	Scanner scan = new Scanner(System.in);
	
	private ArrayList <Moeda> listaMoedas = new ArrayList<Moeda>();
	
	int tipoMoeda;
	double quantia, total; //valor da moeda q o usuário quer colocar no cofre
	
	public void adicionarMoeda() { //adiciona moedas em listaMoedas usando como base o construtor quantidade de Moeda
		System.out.println("Escolha a moeda a adicionar:\n1- Dolar\n2- Euro\n3- Real");
		tipoMoeda = scan.nextInt();	
		switch (tipoMoeda) {
		case 1:
			System.out.println("Digite o valor: ");
			quantia = scan.nextDouble();
			listaMoedas.add(new Dolar(quantia));
			System.out.println("Valor adicionado.");
			break;
		case 2:
			System.out.println("Digite o valor: ");
			quantia = scan.nextDouble();
			listaMoedas.add(new Euro(quantia));
			System.out.println("Valor adicionado.");
			break;
		case 3:
			System.out.println("Digite o valor: ");
			quantia = scan.nextDouble();
			listaMoedas.add(new Real(quantia));
			System.out.println("Valor adicionado.");
			break;
		}
		
	}
	
	public void removerMoeda() { //usa parâmetro equals para identificar a moeda informada e removê-la de listaMoedas
		System.out.println("Escolha a moeda a remover:\n1- Dolar\n2- Euro\n3- Real");
		tipoMoeda = scan.nextInt();
		switch (tipoMoeda) {
		case 1:
			System.out.println("Digite o valor: ");
			quantia = scan.nextDouble();
			listaMoedas.remove(new Dolar(quantia));
			break;
		case 2:
			System.out.println("Digite o valor: ");
			quantia = scan.nextDouble();
			listaMoedas.remove(new Euro(quantia));
			break;
		case 3:
			System.out.println("Digite o valor: ");
			listaMoedas.remove(new Real(quantia));
			quantia = scan.nextDouble();
			break;
		}

	}
	
	public void listagemMoedas() {
		
		if (listaMoedas.isEmpty()) {
			System.out.println("Cofre vazio.");
		} else {
			for (Moeda i: listaMoedas) {
			i.info();
			}	
		}
	}
	
	public void totalConvertido(){ //conta realizada multiplicando quantidade de Moeda pela COTACAO de Euro e Dolar. Finaliza somando valores.
		if (listaMoedas.isEmpty()){
			System.out.println("Cofre vazio.");
		}
		for (Moeda i: listaMoedas) {
			total += i.converter();
		}
	}
}
