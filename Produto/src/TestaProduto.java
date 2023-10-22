import java.util.Scanner;
public class TestaProduto {

	public static void main(String[] args) {
		int ch = 0;
		int i=0;
		Produto[] p = new Produto[50];
		Scanner input = new Scanner(System.in);
		while(ch!=3)
		{
			System.out.println("\t\t\tOPTIONS:");
			System.out.println("1- Criar produto");
			System.out.println("2- Criar produto perecivel");
			System.out.println("3- Encerrar programa");
			ch = input.nextInt();
			if(ch==1)
			{
				System.out.println("Insira uma breve descricao do produto: ");
				input.nextLine();
				String desc = input.nextLine();
				System.out.println("Insira o valor do produto:");
				float val = input.nextFloat();
				p[i] = new Produto(desc, val);
				System.out.println(p[i].toString());
			}
			if(ch==2)
			{
				System.out.println("Insira uma breve descricao do produto: ");
				input.nextLine();
				String desc = input.nextLine();
				System.out.println("Insira o valor do produto:");
				float val = input.nextFloat();
				System.out.println("Insira o ano de validade:");
				int yyyy = input.nextInt();
				System.out.println("Insira o mês de validade:");
				int mm = input.nextInt();
				System.out.println("Insira o dia de validade:");
				int dd = input.nextInt();
				p[i] = new Perecivel(desc, val, dd, mm, yyyy);
				System.out.println();
				System.out.println(p[i].toString());
				if(!((Perecivel) p[i]).estaVencido())
					System.out.println("O produto esta vencido!");
				else
					System.out.println("O produto NAO esta vencido!");
				((Perecivel) p[i]).aplicarDesconto(15);
				System.out.println("Desconto de 15% foi aplicado.");
				System.out.println();
				System.out.println(p[i].toString());
			}
			i++;
		}
		input.close();
		System.out.print("Thank you for using our program!!");
	}

}
