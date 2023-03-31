package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class ejercicioAutomovilTest {
	@Test
	void test() {
		try {ejercicioAutomovil p1 = new ejercicioAutomovil("Honda", "NSX", 1800, "2008", "Blanco", "2", "Gasolina extra", 3000, 350,
				"Deportivo") ;
		p1.acelerar();
		p1.frenar();
		
	}   catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Malo");}
		}	
}
