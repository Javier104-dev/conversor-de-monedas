package ConvertirMonedasAPesos;

import javax.swing.JOptionPane;

public class MonedasAPesos {

	public void ConvertirDolaresAPesos(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 172.44;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Dolares");
	}
	
	public void ConvertirEurosAPesos(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 182.69;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Euros");
	}
	
	public void ConvertirLibrasEsterlinasAPesos(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 209.41;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Libras Esterlinas");
	}
	
	public void ConvertirYenJaponesAPesos(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 1.26;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Yen Japones");
	}
	
	public void ConvertirWonCoreanoAPesos(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 0.13;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Won Coreano");
	}
}
