package aaa;

public class Euro implements Precio{
	private double valor;
	public Euro(double valor) {
	this.valor= valor;
	}
	@Override
	public String calcularPrecio() {			
		return valor+" euros";
	}
	@Override
	public String toString() {
		// return "  " + valor +" euros";
		return this.calcularPrecio();
	}
	

}
