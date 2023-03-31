package ejercicios;

public class contarVocales {

	public static void main(String[] args) {
		String cad = "Hola mundo";
		System.out.println(contarVocales(cad));
	}
	public static int contarVocales(String cadena) {
		int cont = 0;
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				cont++;
			}
		}
		return cont;
	}
}
