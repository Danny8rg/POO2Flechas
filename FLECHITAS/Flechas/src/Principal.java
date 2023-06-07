import javax.swing.JOptionPane;

public class Principal {
Flecha flecha1, flecha2, flecha3, flecha4;
int longitud;
	public static void main(String[] args) {
		Principal miPrincipal = new Principal();

	}
	
	public Principal() {
		
		flecha1 = new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longitud = 34;
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(12, "Negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		flecha3.imprimirEspacio();
		
		longitud = Integer.parseInt(JOptionPane.showInputDialog("de que tamaño quierew la flecha"));
		flecha4 = new Flecha(longitud, "Negro");
		flecha4.construirFlecha();
		flecha4.imprimirEspacio();
		
		
		
	}

}
