package co.edu.udistrital.model;

public class Empleado {
	protected String nombre;
	protected int edad;
	protected String cedula;
	protected double salario;
	
	public 	Empleado(String pnombre, int pedad, String pcedula, double psalario) {
		nombre= pnombre;
		edad= pedad;
		cedula= pcedula;
		salario= psalario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre = "+ nombre + 
				"\nEdad = " + edad +
				"\nCedula = " + cedula +
				"\nSalario = " + salario;
				
	}
	
}