package ejercicios;

public class main {
	public static void main(String[] args) {
		ejercicioAutomovil p1 = new ejercicioAutomovil("Honda", "NSX", 1800, "2008", "Blanco", "2", "Gasolina extra", 3000, 350,
				"Deportivo");
		p1.imprimir();
		p1.acelerar();
		p1.frenar();
	}
}
