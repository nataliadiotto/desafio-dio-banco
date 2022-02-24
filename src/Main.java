
public class Main {

	public static void main(String[] args) {

		Cliente natalia = new Cliente();
		natalia.setNome("Natalia");
		
		Conta cc = new ContaCorrente(natalia);
		cc.depositar(100);
		cc.sacar(27);
				
		Conta poupanca = new ContaPoupanca(natalia);
		cc.transferir(13, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
