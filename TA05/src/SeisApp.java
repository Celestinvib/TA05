import javax.swing.JOptionPane;
public class SeisApp {

	public static void main(String[] args) {

		final double IVA = 0.21;
		double precioP =Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto:"));
		
		JOptionPane.showMessageDialog(null,"Precio con IVA: "+(precioP+(precioP*IVA)));
	
	}

}
