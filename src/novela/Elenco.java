package novela;

public class Elenco {
	
	private String ator;
	private Integer idade;
	
	public Elenco(String ator, Integer idade) {
		this.ator = ator;
		this.idade = idade;
	}

	public String getAtor() {
		return ator;
	}

	public void setAtor(String ator) {
		this.ator = ator;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return ator + ", " + idade + " anos";
	}
	
	

}
