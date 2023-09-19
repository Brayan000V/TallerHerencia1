package co.edu.udistrital.controller;

import co.edu.udistrital.model.Consultor;
import co.edu.udistrital.model.Directivo;
import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Programador;

public class AplMain {

    public static void main(String[] args) {

        Empleado a = new Empleado("Juan", 43, "1011092384", 2000000);
        System.out.println("------------------------");
        System.out.println("Empleado:");
        System.out.println(a);

        Programador b = new Programador("Carlos", 27, "202334983", 3000000, "Java", 35);

        double salarioInicial = b.getSalario();
        double incremento = salarioInicial * 0.15;
        double salarioFinal = salarioInicial + incremento;
        b.setSalario(salarioFinal);

        System.out.println("------------------------");
        System.out.println("Programador:");
        System.out.println(b);
        
        Consultor c = new Consultor("Marco", 31, "1011029314", 5000000, 6, 5);
        
        double salarioInicialConsultor = c.getSalario();
        double incrementoConsultor = salarioInicialConsultor * 0.25;
        double salarioFinalConsultor = salarioInicialConsultor + incrementoConsultor;
        c.setSalario(salarioFinalConsultor);
        
        System.out.println("------------------------");
        System.out.println("Consultor:");
        System.out.println(c);
        
        Directivo d = new Directivo("Juanita", 55, "1092321732", 7000000, 20, "Recursos Humanos");
        
        double salarioInicialDirectivo = d.getSalario();
        double incrementoDirectivo = salarioInicialDirectivo * 0.35;
        double salarioFinalDirectivo = salarioInicialDirectivo + incrementoDirectivo;
        d.setSalario(salarioFinalDirectivo);
        
        System.out.println("------------------------");
        System.out.println("Directivo:");
        System.out.println(d);
    }
}

