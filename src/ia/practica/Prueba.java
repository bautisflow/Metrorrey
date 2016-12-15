package ia.practica;

public class Prueba {

	public static void main(String[] args) {
		
		// Estaciones
				int id = 0;
				
					//Linea 1
				Estacion Talleres = new Estacion(id++, "Talleres", true, 25.754006, -100.365281, new int[] {1});
				Estacion SBernabe = new Estacion(id++, "San Bernabé", true, 25.748407, -100.361720, new int[] {1});
				Estacion UModelo = new Estacion(id++, "Unidad Modelo", true, 25.741914, -100.354793, new int[] {1});
				Estacion Aztlan = new Estacion(id++, "Aztlán", true, 25.732372, -100.347389, new int[] {1});
				Estacion Penitenciaria = new Estacion(id++, "Penitenciaría", true, 25.723265, -100.342576, new int[] {1});
				Estacion Alfonso = new Estacion(id++, "Alfonso Reyes", true, 25.716040, -100.342585, new int[] {1});
				Estacion Mitras = new Estacion(id++, "Mitras", true, 25.706002, -100.342491, new int[] {1});
				Estacion SBolivar = new Estacion(id++, "Simón Bolívar", true, 25.699065, -100.343278, new int[] {1});
				Estacion Hospital = new Estacion(id++, "Hospital", true, 25.692156, -100.344188, new int[] {1});
				Estacion Edison = new Estacion(id++, "Edison", true, 25.687138, -100.333614, new int[] {1});
				Estacion Central = new Estacion(id++, "Central", true, 25.687217, -100.324428, new int[] {1});
				Estacion Cuauhtemoc = new Estacion(id++, "Cuauhtémoc", true, 25.686382, -100.317309, new int[] {1, 2});
				Estacion delGolfo = new Estacion(id++, "Del Golfo", true, 25.685128, -100.306619, new int[] {1});
				Estacion Felix = new Estacion(id++, "Félix U. Gómez", true, 25.683959, -100.296814, new int[] {1, 2});
				Estacion Parque = new Estacion(id++, "Parque Fundidora", true, 25.683783, -100.288231, new int[] {1});
				Estacion Y = new Estacion(id++, "Y Griega", true, 25.683333, -100.279645, new int[] {1});
				Estacion Eloy = new Estacion(id++, "Eloy Cavazos", true, 25.680082, -100.264251, new int[] {1});
				Estacion Lerdo = new Estacion(id++, "Lerdo de Tejada", true, 25.679813, -100.252317, new int[] {1});
				Estacion Expo = new Estacion(id++, "Exposición", true, 25.679525, -100.245584, new int[] {1});
				
					//Linea 2
				Estacion Sendero = new Estacion(id++, "Sendero", true, 25.768611, -100.292885, new int[] {2});
				Estacion Tapia = new Estacion(id++, "Tapia", true, 25.759205, -100.295694, new int[] {2});
				Estacion SNicolas = new Estacion(id++, "San Nicolás", true, 25.752723, -100.298012, new int[] {2});
				Estacion Anahuac = new Estacion(id++, "Anahuac", true, 25.739769, -100.302719, new int[] {2});
				Estacion Universidad = new Estacion(id++, "Universidad", true, 25.724372, -100.308243, new int[] {2});
				Estacion nHeroes = new Estacion(id++, "Niños heroes", true, 25.717017, -100.310901, new int[] {2});
				Estacion Regina = new Estacion(id++, "Regina", true, 25.708288, -100.314140, new int[] {2});
				Estacion GAnaya = new Estacion(id++, "General Anaya", true, 25.697163, -100.316637, new int[] {2});
					// Cuauhtemoc
				Estacion Alameda = new Estacion(id++, "Alameda", true, 25.677052, -100.318131, new int[] {2});
				Estacion Fundadores = new Estacion(id++, "Fundadores", true, 25.672488, -100.319105, new int[] {2});
				Estacion PMier = new Estacion(id++, "Padre Mier", true, 25.668607, -100.315457, new int[] {2});
				Estacion GZarag = new Estacion(id++, "General I. Zaragoza", true, 25.667736, -100.310236, new int[] {2, 3});
				
				
					//Linea 3
					//General I. Zaragoza
				Estacion SLucia = new Estacion(id++, "Santa Lucía", false, 25.670347, -100.298597, new int[] {3});
				Estacion Adolfo = new Estacion(id++, "Adolfo Prieto", false, 25.677850, -100.297642, new int[] {3});
					// Feliz U. Gómez
				Estacion Conchello = new Estacion(id++, "Conchello", false, 25.691054, -100.295765, new int[] {3});
				Estacion Violeta = new Estacion(id++, "Violeta", false, 25.701991, -100.290287, new int[] {3});
				Estacion Ruiz = new Estacion(id++, "Ruiz Cortineś", false, 25.703667, -100.287933, new int[] {3});
				Estacion Angeles = new Estacion(id++, "Los Ángeles", false, 25.708078, -100.281677, new int[] {3});
				Estacion Metropolitano = new Estacion(id++, "Hospital Metropolitano", false, 25.713538, -100.273747, new int[] {3});
				
				
				// Conexiones
				Metro metrorrey = new Metro(id);
				
					// Linea 1
				metrorrey.addVecinos(Talleres, new Estacion[] {SBernabe});
				metrorrey.addVecinos(SBernabe, new Estacion[] {Talleres, UModelo});
				metrorrey.addVecinos(UModelo, new Estacion[] {SBernabe, Aztlan});
				metrorrey.addVecinos(Aztlan, new Estacion[] {UModelo, Penitenciaria});
				metrorrey.addVecinos(Penitenciaria, new Estacion[] {Aztlan, Alfonso});
				metrorrey.addVecinos(Alfonso, new Estacion[] {Mitras, Penitenciaria});
				metrorrey.addVecinos(Mitras, new Estacion[] {Alfonso, SBolivar});
				metrorrey.addVecinos(SBolivar, new Estacion[] {Mitras, Hospital});
				metrorrey.addVecinos(Hospital, new Estacion[] {SBolivar, Edison});
				metrorrey.addVecinos(Edison, new Estacion[] {Hospital, Central});
				metrorrey.addVecinos(Central, new Estacion[] {Edison, Cuauhtemoc});
				metrorrey.addVecinos(Cuauhtemoc, new Estacion[] {Central, delGolfo, GAnaya, Alameda});
				metrorrey.addVecinos(delGolfo, new Estacion[] {Cuauhtemoc, Felix});
				metrorrey.addVecinos(Felix, new Estacion[] {delGolfo, Parque, Conchello, Adolfo});
				metrorrey.addVecinos(Parque, new Estacion[] {Felix, Y});
				metrorrey.addVecinos(Y, new Estacion[] {Parque, Eloy});
				metrorrey.addVecinos(Eloy, new Estacion[] {Y, Lerdo});
				metrorrey.addVecinos(Lerdo, new Estacion[] {Eloy, Expo});
				metrorrey.addVecinos(Expo, new Estacion[] {Lerdo});				
				
					// Linea 2
				metrorrey.addVecinos(Sendero, new Estacion[] {Tapia});
				metrorrey.addVecinos(Tapia, new Estacion[] {Sendero, SNicolas});
				metrorrey.addVecinos(SNicolas, new Estacion[] {Tapia, Anahuac});
				metrorrey.addVecinos(Anahuac, new Estacion[] {SNicolas, Universidad});
				metrorrey.addVecinos(Universidad, new Estacion[] {Anahuac, nHeroes});
				metrorrey.addVecinos(nHeroes, new Estacion[] {Universidad, Regina});
				metrorrey.addVecinos(Regina, new Estacion[] {nHeroes, GAnaya});
				metrorrey.addVecinos(GAnaya, new Estacion[] {Regina, Cuauhtemoc});
					// Cuauhtemoc
				metrorrey.addVecinos(Alameda, new Estacion[] {Cuauhtemoc, Fundadores});
				metrorrey.addVecinos(Fundadores, new Estacion[] {Alameda, PMier});
				metrorrey.addVecinos(PMier, new Estacion[] {Fundadores, GZarag});
				metrorrey.addVecinos(GZarag, new Estacion[] {PMier, SLucia});
				
					// Linea 3
				metrorrey.addVecinos(Metropolitano, new Estacion[] {Angeles});
				metrorrey.addVecinos(Angeles, new Estacion[] {Metropolitano, Ruiz});
				metrorrey.addVecinos(Ruiz, new Estacion[] {Angeles, Violeta});
				metrorrey.addVecinos(Violeta, new Estacion[] {Ruiz, Conchello});
				metrorrey.addVecinos(Conchello, new Estacion[] {Violeta, Felix});
					// Felix
				metrorrey.addVecinos(Adolfo, new Estacion[] {Felix, SLucia});
				metrorrey.addVecinos(SLucia, new Estacion[] {Adolfo, GZarag});
					// GZarag
				
				
				
				//Print
				//System.out.println(metrorrey);
				
				Algoritmo A = new Algoritmo(metrorrey);
				
				// Con transbordos
				System.out.print("Ruta con transbordo: ");
				System.out.println(A.AestrellaConT(GAnaya, SLucia));
				
				// Sin transbordos
				System.out.print("Ruta sin transbordo: ");
				System.out.println(A.AestrellaSinT(GAnaya, SLucia));
		
		
	}

}
