package controlVersiones;

public class Empleado {
	
	/**
	 * @author UnaiUrtiaga
	 * @version Version 1, 2021
	 * @since 24/05/2021
	 * 
	 */

	private String nombre;
	private String apellidos;
	private double salario; 
	
	/**
	 * @param nombre es una atributo tipo string que se referirá al nombre del empleado
	 * @param apellido es un atributo tipo string que se referirá a los apellidos del empleado
	 * @param salario es un atributo tipo double (numeros) que se referirá al salario del empleado
	 */
	

	
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


public void subirsalario (double subida) {
	salario=salario+subida;
}

/**
 * subirsalario es un metodo el cual aumenta la cantidad de la variable salario con un parametro enviado por otra clase
 */

}