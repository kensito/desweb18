package usjt.olimpiada.model;

public class Ano {

	private int Ano;
	private char tipo;
	
	public Ano() {
		
	}
	
	public Ano(int ano, char tipo) {
		Ano = ano;
		this.tipo = tipo;
	}
	
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ano [Ano=" + Ano + ", tipo=" + tipo + "]";
	}
	
}
