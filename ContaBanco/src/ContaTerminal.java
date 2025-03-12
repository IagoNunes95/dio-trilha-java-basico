import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		//TODO:Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para o usuario
		
		//Obter pela scanner os valores digitados
		
		//Exibit a mensagem final da conta criada
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Olá, seja bem vindo a criação de contas do banco");
		
		System.out.println("Por favor, digite seu nome!");
		String nome = scanner.nextLine();
		
		System.out.println("Por favor, digite sua agência!");
		String agencia = scanner.nextLine();
		
		System.out.println("Por favor, o número da sua conta!");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite um valor para deposito!");
		Double saldo = scanner.nextDouble();
		
		System.out.println("Por gentileza, aguarde enquanto criamos sua nova conta...");
		
		System.out.println("....");
		System.out.println("....");
		System.out.println("....");
		System.out.println("....");
		
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "
				+agencia+", conta "+numero+" e seu saldo de "+saldo+" reais, já está disponível para saque.");
		
	}
	
}
