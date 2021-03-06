
public class Main {

	public static void main(String[] args) {

		Cliente natalia = new Cliente();
		natalia.setNome("Natalia");
		
		Conta cc = new ContaCorrente(natalia);
		cc.depositar(100);
					
		Conta poupanca = new ContaPoupanca(natalia);
		cc.transferir(50, poupanca);
		poupanca.sacar(27);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
