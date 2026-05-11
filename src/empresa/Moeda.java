package empresa;

public abstract class Moeda {

		double quantidade, COTACAO;
		
		Moeda(Double q){
			quantidade = q;
		}
		
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(quantidade) == Double.doubleToLongBits(other.quantidade);
	}
		
		abstract double converter();
		
		abstract void info();

}