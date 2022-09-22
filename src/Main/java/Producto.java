package aaa;

public class Producto {
	private String nombre;
	private double precioEnEuros;
	
	
	public Producto(String nombre, double d) {
		this.nombre = nombre;
		this.precioEnEuros = d;
	}
	
	public double getPrecioEnEuros() {
		return precioEnEuros;
	}

	// Inyeccion en el metodo convertirMoneda>
	// el parametro precio es interface para garantizar que sea dinamico
	public String convertirMoneda(Precio precio) {
	
		return nombre + precio;
		
	}
	
	@Override
	public String toString() {
		return "Producto=" + nombre + ", precio=" + precioEnEuros + "]";
	}
	
	
}
