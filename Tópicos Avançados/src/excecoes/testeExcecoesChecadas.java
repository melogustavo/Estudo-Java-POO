package excecoes;

public class testeExcecoesChecadas {


	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.sacar(60);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpe, saldo insuficiente.");
		}
		System.out.println("Saldo: " + cc.getSaldo());
		
		
		try {
			cc.sacar(50);
		} catch (SaldoInsuficienteException e){
			System.out.println("Desculpe, saldo insuficiente.");
		} 
		finally { //ele sempre vai executar o finaly, independente se entrou no catch ou n�o
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		System.out.println("Saldo agora: " + cc.getSaldo());
		
	}
}
