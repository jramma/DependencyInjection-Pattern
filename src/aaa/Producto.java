package aaa;

public class Producto {
	private String nombre;
	private double precioEnEuros;
	
	// Inyeccion en el constructor>
	// el parametro precio es interface para garantizar que sea dinamico
	public Producto(String nombre, double d) {
		this.nombre = nombre;
		this.precioEnEuros = d;
	}
	
	public double getPrecioEnEuros() {
		return precioEnEuros;
	}


	public String convertirMoneda(Precio precio) {
	
		return nombre + precio;
		
	}
	
	@Override
	public String toString() {
		return "Producto=" + nombre + ", precio=" + precioEnEuros + "]";
	}
	
	
}
