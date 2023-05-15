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
		
		System.out.println();
		System.out.println("Salário Liquido: " + emp.salarioLiquido());
		System.out.println();
		System.out.print("Percentagem para reajuste: ");
		double porcentagem = sc.nextDouble();
		emp.reajusteSalarial(porcentagem);
		
		System.out.println();
		System.out.print("Salário com reajuste: " + emp.salarioLiquido());
		
		
		
		
		sc.close();

	}

}
