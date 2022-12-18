package MenuPrincipal;

import javax.swing.JOptionPane;


import MenuDeCambio.OpcionesDeCambio;



public class Menu {
	
	public static void main(String[] args) {
		OpcionesDeCambio logicaCambio = new OpcionesDeCambio();
		boolean confirmacion = true;
		
		while(confirmacion) {
			String seleccionUsuario = (JOptionPane.showInputDialog(null, "Selecciona una opcion para convertir", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
						
			switch (seleccionUsuario) {		
				case "Conversor de Moneda":
					String inputUsuario = JOptionPane.showInputDialog("Ingrese su valor a convertir");
					
					if(validar(inputUsuario) == true) {
						Double inputUsuarioDouble = Double.parseDouble(inputUsuario);
						logicaCambio.IntermediarioParaConvertir(inputUsuarioDouble);
						
						int menuFinal = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?", "Menu final", JOptionPane.YES_NO_OPTION);
						
						if(JOptionPane.OK_OPTION == menuFinal) {		
							System.out.println("Selecciona ok");
						
						}else {
							confirmacion = false;
							JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");
						}
	
					}else {
						JOptionPane.showMessageDialog(null, "Solamente se permiten numeros", "Alerta de input", JOptionPane.WARNING_MESSAGE);
						System.out.println("Valor erroneo");
					}
				break;
				
				case "Conversor de Temperatura":
			        JOptionPane.showMessageDialog(null, "Lo siento, esta seccion aun no esta disponible", "Error", JOptionPane.ERROR_MESSAGE);
			    break;
				
			}		
		}
	}
	
	public static boolean validar(String cadena) {
		if (cadena.matches("^\\d+$")){
			return true;
		} else {
			return false;
		}
	}
}

