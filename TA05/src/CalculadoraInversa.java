import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("1�Operanndo:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("2�Operanndo:"));	
		String operador = JOptionPane.showInputDialog("Signo aritm�tico:");	
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
			JOptionPane.showMessageDialog(null,"Signo aritm�tico no v�lido");	
		}
		
		JOptionPane.showMessageDialog(null,resultado);				
	}

}
