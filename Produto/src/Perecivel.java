import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
		String valistr = String.format("%02d",validade[0])+"-"+String.format("%02d",validade[1])+"-"+String.format("%04d",validade[2]);
		LocalDate date = LocalDate.parse(valistr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		if((date).isBefore(LocalDate.now()))
			return false;
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
		String valistr = String.format("%04d",validade[2])+"/"+String.format("%02d",validade[1])+"/"+String.format("%02d",validade[0]);
		return super.toString()+" - Data de validade: "+ valistr;
	}
}
