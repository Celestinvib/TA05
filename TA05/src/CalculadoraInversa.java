import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1ºOperanndo:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2ºOperanndo:"));	
		String operador = JOptionPane.showInputDialog("Signo aritmético:");	
		double resultado = 0;
		
		switch(operador) {
		case("+"):
			resultado = num1 + num2;
			break;
		case("-"):
			resultado = num1 - num2;
			break;
		case("*"):
			resultado = num1 * num2;
			break;
		case("/"):
			resultado = num1 / num2;
			break;
		case("^"):
			resultado = Math.pow(num1, num2);
			break;
		case("%"):
			resultado = num1 % num2;
			break;	
		default:
			JOptionPane.showMessageDialog(null,"Signo aritmético no válido");	
		}
		
		JOptionPane.showMessageDialog(null,resultado);				
	}

}
