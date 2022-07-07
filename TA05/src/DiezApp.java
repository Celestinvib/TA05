import javax.swing.JOptionPane;
public class DiezApp {

	public static void main(String[] args) {

		int numVentas =Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas:"));
		double sumaVentas = 0;
		
		for (int i = 1; i <= numVentas; i++) {
			sumaVentas += Integer.parseInt(JOptionPane.showInputDialog("Precio del producto "+i+"(€ Sin IVA):"));
		}
		
		JOptionPane.showMessageDialog(null,"Suma de todas las ventas: "+(sumaVentas+(sumaVentas*0.21)+" €"));
	}

}
