import javax.swing.JOptionPane;

public class CuatroApp {

	public static void main(String[] args) {
		
		double R =Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio:"));
		System.out.println(Math.PI*Math.pow(R, 2)+" cm2");
	}

}
