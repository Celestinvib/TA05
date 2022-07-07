import javax.swing.JOptionPane;
public class CincoApp {

	public static void main(String[] args) {
		double num =Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero:"));
		
		if(num % 2 == 0) {
			System.out.println(num +" es divisible entre 2");
		}else {
			System.out.println(num +" no es divisible entre 2");			
		}
	}

}
