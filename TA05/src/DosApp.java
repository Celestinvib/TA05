import javax.swing.JOptionPane;
public class DosApp {

	public static void main(String[] args) {
//		String nombre = "Celestin";
		String nombre = JOptionPane.showInputDialog("Introduce un nombre:");
		
		System.out.println("Bienvenido "+nombre);
	}

}
