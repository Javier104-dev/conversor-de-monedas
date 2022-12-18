package ConvertirPesos;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 0.0058;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Dolares");
	}
	
	public void ConvertirPesosAEuros(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 0.0055;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Euros");
	}
	
	public void ConvertirPesosALibrasEsterlinas(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 0.0048;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYenJapones(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 0.79;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Yen Japones");
	}
	
	public void ConvertirPesosAWonCoreano(Double inputUsuario) {
		double monedaConvertida = inputUsuario * 7.60;
		//100d devuelve el valor a dos decimales, si lo quiero de 3 hago 1000d
		monedaConvertida = (double) Math.round(monedaConvertida * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes " + monedaConvertida + " Won Coreano");
	}
}
