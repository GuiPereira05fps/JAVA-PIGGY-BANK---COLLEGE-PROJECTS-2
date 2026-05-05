package empresa;

public class Euro extends Moeda{

	Euro(Double q) {
		super(q);
	}
	
	final double COTACAO = 6.34;

	public double converter() {
		return COTACAO * quantidade;
	}

	@Override
	public void info() {
		System.out.printf("\nEuro: €%.2f\n", quantidade);
		
	}

}
