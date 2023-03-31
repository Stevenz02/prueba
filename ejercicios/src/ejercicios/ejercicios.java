package ejercicios;

public class ejercicios {

	public class persona{
		private String nombre;
		private String apellido;
		private String id;
		private String fechaNacimiento;
		
	public persona(String nombre, String apellido, String id, String fechaNacimiento) {
		
	this.nombre=nombre;
	this.apellido=apellido;
	this.id=id;
	this.fechaNacimiento=fechaNacimiento;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String ape) {
		this.apellido=ape;
	}
	}
}
