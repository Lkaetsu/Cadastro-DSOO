
public class Produto {
	private String descricao;		// Definindo as variaveis de instancia
	private int id;
	private double valor;
	
	private static int quantidade;	// Definindo a variavei de classe
	
	// Construtor
	public Produto(String descricao,double valor)
	{
		this.descricao = descricao;
		this.valor = valor;
		quantidade++;
		this.id=quantidade;
	}
	
	// Retorna a descricao do produto
	public String getDescricao()
	{
		return descricao;
	}
	
	// Retorna o id do produto
	public int getId()
	{
		return id;
	}
	
	// Retorna o valor do produto
	public double getValor()
	{
		return valor;
	}
	
	// Retorna a quantidade de produtos
	public int getQuantidade()
	{
		return quantidade;
	}
	
	// Metodo que muda a descricao do produto
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	
	// Metodo que muda o valor do produto
	public void setId(int id)
	{
		this.id = id;
	}
	
	// Metodo que muda o valor do produto
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	
	// Metodo que transforma as informacoes do produto em uma String
	public String toString()
	{
		return "Descricao: "+descricao+" - Id:"+id+" - Valor: "+valor;
	}
}
