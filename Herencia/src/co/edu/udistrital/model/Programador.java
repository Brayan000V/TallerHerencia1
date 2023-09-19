package co.edu.udistrital.model;

public class Programador extends Empleado {
    private String lenguajePDominante;
    private int nCodigoLineasHora;

    public Programador(String pnombre, int pedad, String pcedula, double psalario, String plenguajePDominante, int pnCodigoLineasHora) {
        super(pnombre, pedad, pcedula, psalario); 

        lenguajePDominante = plenguajePDominante;
        nCodigoLineasHora = pnCodigoLineasHora;
    }



	public String getLenguajePDominante() {
		return lenguajePDominante;
	}



	public void setLenguajePDominante(String lenguajePDominante) {
		this.lenguajePDominante = lenguajePDominante;
	}



	public int getnCodigoLineasHora() {
		return nCodigoLineasHora;
	}



	public void setnCodigoLineasHora(int nCodigoLineasHora) {
		this.nCodigoLineasHora = nCodigoLineasHora;
	}



	public String toString() {
		return "Nombre = "+ nombre + 
				"\nEdad = " + edad +
				"\nCedula = " + cedula +
				"\nSalario = " + salario +
				"\nLenguaje Dominante = " + lenguajePDominante +
				"\nNumero de Lineas de Codigo por Hora = " + nCodigoLineasHora;
				
	}
}

