package application;

public class Salario {

	public String name;
	public double salarioBruto;
	public double desconto;
	
	public double salarioLiquido() {
		return salarioBruto - desconto;
	}
	
	public void reajusteSalarial(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", salarioLiquido());
	}

}
