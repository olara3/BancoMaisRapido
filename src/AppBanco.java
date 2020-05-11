import model.ContaBancaria;
import java.util.Scanner;
public class AppBanco {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria contas [];
		contas = new ContaBancaria[10];
		// criei as contas
		for (int pos = 0; pos <= contas.length -1; pos++) {
			contas [pos] = new ContaBancaria("111.111.111-1"+pos, 10000+pos, pos);
			contas [pos].creditar(1000 + (pos*100));
		}
		// exibir as informacoes
		for (int pos=0;pos < contas.length; pos++) {
			System.out.println(contas[pos].exibirInfo());
		}
		System.out.println("................ ");
		System.out.println("Digite uma conta: ");
		int lerTeclado = teclado.nextInt();
		boolean achou = false;
		
		for (int pos=0;pos < contas.length && !achou; pos++) {
			System.out.printf("%d - ", pos);
				if (contas[pos].getNumeroConta() == lerTeclado) {
					System.out.println("Conta encontrada: ");
					System.out.println(contas[pos].exibirInfo());
					achou = true;
				}
			}
		if (!achou) {
			System.out.println ("Conta Nao encontrada!");
		}
		}
}
