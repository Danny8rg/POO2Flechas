public class Flecha {

	int longitud;
	String color;
	
	public Flecha () {
		longitud = 18;
		color = "Negro";
	}
	public void imprimirEspacio () {
		System.out.println();
	}
	
	public void construirFlecha () {
		for (int i = 0; i<longitud; i++) {
			imprimir("-");
		}
		imprimir(">");
	}
	
	private void imprimir(String simbolo) {
		if (color.equals("Negro") ) {
			System.out.print(simbolo);
		} else {
			System.err.print(simbolo);
		}
	}
	
	public Flecha (int longitud, String color) {
		this.longitud = longitud;
		this.color = color;
	}
	
}
