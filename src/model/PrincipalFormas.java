package model;

public class PrincipalFormas {

	public static void main(String[] args) {
	      
	    Paralelogramo paralelogramo = new Paralelogramo(5, 3);
	    System.out.println("Área do Paralelogramo: " + paralelogramo.calcArea());
	    System.out.println("Perímetro do Paralelogramo: " + paralelogramo.calcPerimetro());
	    System.out.println();

	    Trapezio trapezio = new Trapezio(8, 4, 6);
	    System.out.println("Área do Trapézio: " + trapezio.calcArea());
	    System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());
	    }
	}
