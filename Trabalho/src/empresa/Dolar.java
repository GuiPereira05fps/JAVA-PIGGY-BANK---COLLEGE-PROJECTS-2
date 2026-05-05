package empresa;

public class Dolar extends Moeda{
	
	Dolar(Double q) {
		super(q);
	}
	
	final double COTACAO = 5.44;

	public double converter() {
		return COTACAO * quantidade;
	}

	@Override
	void info() {
		System.out.printf("\nDólar: $%.2f\n", quantidade);
	}
}
