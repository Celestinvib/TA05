import javax.swing.JOptionPane;
public class OnceApp {

	public static void main(String[] args) {

		String dia =JOptionPane.showInputDialog("Introduce un dia de la semana:(Acu�rdate de poner los acentos!)");
		System.out.println(dia);
		
		switch (dia.toLowerCase()) {
		case "lunes":
			JOptionPane.showMessageDialog(null,"El "+dia+" es un dia laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null,"El "+dia+" es un dia laboral");
			break;
		case "mi�rcoles":
			JOptionPane.showMessageDialog(null,"El "+dia+" es un dia laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null,"El "+dia+" es un dia laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null,"El "+dia+" es un dia laboral");
			break;
		case "s�bado":
			JOptionPane.showMessageDialog(null,"El "+dia+" no es un dia laboral");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null,"El "+dia+" no es un dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null,dia +" no es un dia de la semana");			
		}
	}

}
