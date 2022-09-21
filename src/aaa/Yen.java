package aaa;

public class Yen implements Precio{
	private double valor;
	public Yen(double valor) {
		this.valor= valor;
		}
	
	
	@Override
	public String calcularPrecio() {
		// TODO Auto-generated method stub
	return (valor*142.53)+ "yenes";

	}


	@Override
	public String toString() {
		return "  " + (valor*142.53)+ " yenes";
	}
	
	
}
