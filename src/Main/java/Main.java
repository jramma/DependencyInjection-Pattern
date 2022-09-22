
import java.util.ArrayList;

public class Main {
	static ArrayList<Producto> productos = new ArrayList<Producto>();

	public static void main(String[] args) {
		productosInventados();
		int decision =0 ;
		do {
			decision = Entrada.leerInt(" 0.Salir \n 1.Euros \n 2.Libra \n Default.Yenes");
		
					
				switch (decision) {
		case 1:
			for (int i = 0; i < productos.size(); i++) {
				System.out.println(productos.get(i).convertirMoneda((new Euro(productos.get(i).getPrecioEnEuros()))));

			}
			break;
		case 2:
			for (int i = 0; i < productos.size(); i++) {
				System.out.println(productos.get(i).convertirMoneda((new Libra(productos.get(i).getPrecioEnEuros()))));

			}
			break;
		default:
			for (int i = 0; i < productos.size(); i++) {
				System.out.println(productos.get(i).convertirMoneda((new Yen(productos.get(i).getPrecioEnEuros()))));

			}
		}}while(decision !=0 );

	}

	private static void productosInventados() {
		Producto producto = new Producto("Iphone", 1200.99);
		Producto producto1 = new Producto("TV", 200.25);
		productos.add(producto);
		productos.add(producto1);
	}

}
