import javax.swing.JOptionPane;
public class DiezApp {

	public static void main(String[] args) {

		int numVentas =Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas:"));
		double sumaVentas = 0;
		
		for (int i = 1; i <= numVentas; i++) {
			sumaVentas += Integer.parseInt(JOptionPane.showInputDialog("Introduce cuanto se ha ganado en la venta"+i+":"));
		}
		
		JOptionPane.showMessageDialog(null,"Suma de todaas las ventas: "+sumaVentas);
	}

}
