import java.time.LocalDate;

public class Perecivel extends Produto{
	private int[] validade;				//Definindo variavel de instancia
	
	// Construtor
	public Perecivel(String descricao, double valor, int dd, int mm, int yyyy)
	{
		super(descricao, valor);
		validade= new int[3];
		validade[0] = dd;
		validade[1] = mm;
		validade[2] = yyyy;
	}
	
	// Metodo que verifica se o produto esta vendido
	public boolean estaVencido()
	{
		LocalDate date = LocalDate.parse(validade[0]+"-"+validade[1]+"-"+validade[2]);
		if((date).isBefore(LocalDate.now()))
			return false;
		else if(date.isAfter(LocalDate.now()))
			return true;
		else
			return true;
	}
	
	// Metodo que aplica desconto ao valor
	public void aplicarDesconto(double desconto)
	{
		desconto = desconto/100;
		double novo = getValor();
		novo = novo-(novo*desconto);
		setValor(novo);
	}
	
	// Metodo que retorna as informacoes do objeto
	public String toString()
	{
		return super.toString()+" - Data de validade: "+ validade[0]+"/"+validade[1]+"/"+validade[2];
	}
}
