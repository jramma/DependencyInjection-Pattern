
public class Libra implements Precio{
	private double valor;
	public Libra(double valor) {
		this.valor= valor;
		}
	@Override
	public String toString() {
		return "  " + (valor*0.87)+" libras";
	}
	@Override
	public String calcularPrecio() {
		// TODO Auto-generated method stub
	//return  (valor*0.87)+" libras";
		return this.calcularPrecio();
	}
	
	

}
