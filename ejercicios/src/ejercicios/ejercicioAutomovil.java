package ejercicios;

import javax.swing.JOptionPane;

public class ejercicioAutomovil {
		private String marca;
		private String modelo;
		private int cilindraje;
		private String anioDeFabricacion;
		private String color;
		private String numPuertas;
		private String combustible;
		private int kilometraje;
		private int velMaxima;
		private String tipoVehiculo;

		// Se crea el objeto automovil
		public ejercicioAutomovil(String marca, String modelo, int cilindraje, String anioDeFabricacion, String color,
				String numPuertas, String combustible, int kilometraje, int velMaxima, String tipoVehiculo) {
			this.marca = marca;
			this.modelo = modelo;
			this.cilindraje = cilindraje;
			this.anioDeFabricacion = anioDeFabricacion;
			this.color = color;
			this.numPuertas = numPuertas;
			this.combustible = combustible;
			this.kilometraje = kilometraje;
			this.velMaxima = velMaxima;
			this.tipoVehiculo = tipoVehiculo;
		}
		// Se crea el metodo de aceleración
		public void acelerar() {
			int conteoVelocidad = 0;
			int contador = 0;
			int acelerar = 0;
			// Realizamos un ciclo para que acelere hasta que la velocidad maxima llegue al limite
			while (contador == 0) {
				acelerar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quiere acelerar?"));
				if (acelerar > 0 && conteoVelocidad < velMaxima) {
					if (velMaxima >= acelerar && velMaxima > conteoVelocidad) {
						conteoVelocidad = conteoVelocidad + acelerar;
						System.out.println("La velocidad actual es de :" + conteoVelocidad + "Km/h");

					} else {
						// Se calcula el exceso de velocidad
						int exceso = ((conteoVelocidad + acelerar) - velMaxima);
						System.out.println("Velocidad maxima alcanzada," + exceso + "km/h");
					}

				} else {
					int exceso = ((conteoVelocidad + acelerar) - velMaxima);
					System.out.println("Velocidad maxima alcanzada, " + exceso + "km/h");

					contador++;
				}
			}
		}

		// Se crea el metodo para frenar
		public void frenar() {
			int contVelocidad = 0;
			int i = 0;
			int desaceleracion = 0;
			int frenado = velMaxima;
			// Se crea un ciclo para que disminuya la velocidad hasta que pare
			while (i == 0) {

				desaceleracion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quiere frenar?"));
				if (desaceleracion > 0 && contVelocidad <= velMaxima) {
					if (velMaxima <= desaceleracion && velMaxima > contVelocidad) {
						contVelocidad = contVelocidad - desaceleracion;
						System.out.println(contVelocidad);
					} else {
						frenado = ((contVelocidad - desaceleracion) + velMaxima);
						System.out.println("Velocidad actual " + frenado);
						frenado += frenado;
					}
					// Condicionamos la parada hasta que llegue a cero
				} else if (velMaxima - desaceleracion == 0) {
					System.out.println("El vehículo esta parado");
					i++;

				} else
					break;
			}
		}

		// Metodos setters and getters
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getCilindraje() {
			return cilindraje;
		}

		public void setCilindraje(int cilindraje) {
			this.cilindraje = cilindraje;
		}

		public String getAnioDeFabricacion() {
			return anioDeFabricacion;
		}

		public void setAnioDeFabricacion(String anioDeFabricacion) {
			this.anioDeFabricacion = anioDeFabricacion;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getNumPuertas() {
			return numPuertas;
		}

		public void setNumPuertas(String numPuertas) {
			this.numPuertas = numPuertas;
		}

		public String getCombustible() {
			return combustible;
		}

		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}

		public int getKilometraje() {
			return kilometraje;
		}

		public void setKilometraje(int kilometraje) {
			this.kilometraje = kilometraje;
		}

		public int getVelMaxima() {
			return velMaxima;
		}

		public void setVelMaxima(int velMaxima) {
			this.velMaxima = velMaxima;
		}

		public String getTipoVehiculo() {
			return tipoVehiculo;
		}

		public void setTipoVehiculo(String tipoVehiculo) {
			this.tipoVehiculo = tipoVehiculo;
		}

		public void imprimir() {
			System.out.println("Marca :" + marca + "\nModelo : " + modelo + "\nCilindraje : " + cilindraje
					+ "\nAño de fabricacion : " + anioDeFabricacion + "\nColor : " + color + " \nNumero de puertas : "
					+ numPuertas + "\nTipo de combustible : " + combustible + "\nKilometraje : " + kilometraje
					+ "\nVelocidad maxima : " + velMaxima + "\nTipo de vehiculo :  " + tipoVehiculo);
	}
}