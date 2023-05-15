package entities;

import java.util.Locale;
import java.util.Scanner;

import application.Salario;

public class Reajuste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario emp = new Salario();
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Desconto: ");
		emp.desconto = sc.nextDouble();
		
		
		
		
		
		
		
		sc.close();

	}

}
