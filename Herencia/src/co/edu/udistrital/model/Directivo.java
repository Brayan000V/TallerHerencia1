package co.edu.udistrital.model;

public class Directivo extends Empleado {
	private int añosexp;
    private String areaEncargada;

    public Directivo(String pnombre, int pedad, String pcedula, double psalario, int pañosexp, String pareaEncargada) {
        super(pnombre, pedad, pcedula, psalario); 

        añosexp = pañosexp;
        areaEncargada = pareaEncargada;       
        
    }

	public int getAñosexp() {
		return añosexp;
	}

	public void setAñosexp(int añosexp) {
		this.añosexp = añosexp;
	}

	public String getAreaEncargada() {
		return areaEncargada;
	}

	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}
	public String toString() {
		return "Nombre = "+ nombre + 
				"\nEdad = " + edad +
				"\nCedula = " + cedula +
				"\nSalario = " + salario +
				"\nAnos de Experiencia = " + añosexp +
				"\nArea Encargado = " + areaEncargada;
				
	}

}
