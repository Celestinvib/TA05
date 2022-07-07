import javax.swing.JOptionPane;
public class DoceApp {

	public static void main(String[] args) {
		String pass= "pass";
		String userInput ="";
		int intentos =3;
		
		while(!userInput.equals(pass) && intentos != 0 ) {
			userInput =JOptionPane.showInputDialog("[intentos:"+intentos+"] introduce la contraseña:");	
			intentos--;
		}
		
		if(intentos > 0) {
			JOptionPane.showMessageDialog(null," Enhorabuena");		
		}else {
			JOptionPane.showMessageDialog(null," Has agotado tus intentos");			
		}
	}

}
