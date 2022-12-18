package MenuDeCambio;

import javax.swing.JOptionPane;

import ConvertirMonedasAPesos.MonedasAPesos;
import ConvertirPesos.ConvertirMonedas;

public class OpcionesDeCambio {

	ConvertirMonedas logicaConvertir = new ConvertirMonedas();
	MonedasAPesos logicaMonedasAPesos = new MonedasAPesos();
	
	public void IntermediarioParaConvertir(Double inputUsuario) {
		
		String opcionesDeCambio = (JOptionPane.showInputDialog(null, "Selecciona la moneda para convertir", "Menu de cambio",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Convertir Pesos a Dolares",
						"Conversor Pesos a Euros",
						"Conversor Pesos a Libras Esterlinas",
						"Conversor Pesos a Yen Japones",
						"Conversor Pesos a Won Coreano",
						
						"Dolares a Pesos",
						"Euros a Pesos",
						"Libras Esterlinas a Pesos",
						"Yen Japones a Pesos",
						"Won Coreano a Pesos",
						}, "Seleccion")).toString();
		
		switch (opcionesDeCambio) {			
			case "Convertir pesos a dolares":
				logicaConvertir.ConvertirPesosADolares(inputUsuario);
			break;			
			
			case "Conversor pesos a Euros":
				logicaConvertir.ConvertirPesosAEuros(inputUsuario);
			break;
			
			case "Conversor pesos a Libras Esterlinas":
				logicaConvertir.ConvertirPesosALibrasEsterlinas(inputUsuario);
			break;
			
			case "Conversor pesos a Yen Japones":
				logicaConvertir.ConvertirPesosAYenJapones(inputUsuario);
			break;
		
			case "Conversor pesos a Won Coreano":
				logicaConvertir.ConvertirPesosAWonCoreano(inputUsuario);
			break;
			
			/////////////////////////////////////////////////////////////
			
			case "Dolares a Pesos":
				logicaMonedasAPesos.ConvertirDolaresAPesos(inputUsuario);
			break;			
			
			case "Euros a Pesos":
				logicaMonedasAPesos.ConvertirEurosAPesos(inputUsuario);
			break;
			
			case "Libras Esterlinas a Pesos":
				logicaMonedasAPesos.ConvertirLibrasEsterlinasAPesos(inputUsuario);
			break;
			
			case "Yen Japones a Pesos":
				logicaMonedasAPesos.ConvertirYenJaponesAPesos(inputUsuario);
			break;
		
			case "Won Coreano a Pesos":
				logicaMonedasAPesos.ConvertirWonCoreanoAPesos(inputUsuario);
			break;
			
			
		}
	}
}
