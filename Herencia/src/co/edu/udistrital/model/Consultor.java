package co.edu.udistrital.model;

public class Consultor extends Empleado{
	private int añosexp;
    private int equiposHaLiderado;

    public Consultor(String pnombre, int pedad, String pcedula, double psalario, int pañosexp, int pequiposHaLiderado) {
        super(pnombre, pedad, pcedula, psalario); 

        añosexp = pañosexp;
        equiposHaLiderado = pequiposHaLiderado;       
        
    }

	public int getAñosexp() {
		return añosexp;
	}

	public void setAñosexp(int añosexp) {
		this.añosexp = añosexp;
	}

	public int getEquiposHaLiderado() {
		return equiposHaLiderado;
	}

	public void setEquiposHaLiderado(int equiposHaLiderado) {
		this.equiposHaLiderado = equiposHaLiderado;
	}
	public String toString() {
		return "Nombre = "+ nombre + 
				"\nEdad = " + edad +
				"\nCedula = " + cedula +
				"\nSalario = " + salario +
				"\nAnos de Experiencia = " + añosexp +
				"\nEquipos liderados = " + equiposHaLiderado;
				
	}

}