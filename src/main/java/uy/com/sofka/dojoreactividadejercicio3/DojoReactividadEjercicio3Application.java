package uy.com.sofka.dojoreactividadejercicio3;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DojoReactividadEjercicio3Application {

  public static String derivada(int a, int b, int c, int n){
    String aDerivada = n-1 >= 2 ? String.valueOf(n*a) + "X^" + String.valueOf(n-1) : n-1 >= 1 ? String.valueOf(n*a) + "X" : n-1 >= 0 ? String.valueOf(n*a) : "";
    String bDerivada = n-1-1 >= 2 ? " + " + String.valueOf((n-1)*b) + "X^" + String.valueOf(n-1-1) : n-1-1 >= 1 ? " + " + String.valueOf((n-1)*b) + "X" : n-1-1 >= 0 ? " + " + String.valueOf((n-1)*b) : "";
    String cDerivada = n-1-1-1 >= 2 ? " + " + String.valueOf((n-1-1)*c) + "X^" + String.valueOf(n-1-1-1) : n-1-1-1 >= 1 ? " + " + String.valueOf((n-1-1)*c) + "X" : n-1-1-1 >= 0 ? " + " + String.valueOf((n-1-1)*c) : "";
    return aDerivada + bDerivada + cDerivada;
  }
	public static void main(String[] args) {
		SpringApplication.run(DojoReactividadEjercicio3Application.class, args);

    System.out.println("\nUtilizando las variables a,b,c y un exponente: ");
    
    System.out.println("\nIngrese el valor de 'a'");
    Scanner scannerA = new Scanner(System.in);
    Integer a = Integer.parseInt(scannerA.nextLine()); 
    System.out.println("Ingrese el valor de 'b'");
    Scanner scannerB = new Scanner(System.in);
    Integer b = Integer.parseInt(scannerB.nextLine()); 
    System.out.println("Ingrese el valor de 'c'");
    Scanner scannerC = new Scanner(System.in);
    Integer c = Integer.parseInt(scannerC.nextLine()); 
    System.out.println("Ingrese el valor del exponente 'n'");
    Scanner scannerN = new Scanner(System.in);
    Integer exponente = Integer.parseInt(scannerN.nextLine()); 

    System.out.println("La derivada es " + derivada(a, b, c, exponente));
	}

}