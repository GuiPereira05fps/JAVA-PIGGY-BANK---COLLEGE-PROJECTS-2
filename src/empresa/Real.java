package empresa;

public class Real extends Moeda {

	Real(Double q) {
		super(q);
	}
	
	@Override
	public void info() {
		System.out.printf("\nReal: R$%.2f\n", quantidade);
		
	}

	@Override
	double converter() {
		return 0; //deve ser mantido em 0 pois já se encontra em real
	}

}
