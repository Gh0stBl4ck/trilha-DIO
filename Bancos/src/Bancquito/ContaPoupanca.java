package Bancquito;

public class ContaPoupanca {
	public ContaPoupanca(Cliente cliente) {
		super();
	}
	
	public void ImprimirExtrato(){
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
