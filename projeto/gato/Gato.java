package projeto.gato;

public class Gato {

	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRabo() {
		return rabo;
	}

	public void setRabo(String rabo) {
		this.rabo = rabo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	private String rabo;
	private Integer idade;

	public Gato(String nome, String rabo, Integer idade) {
		this.nome = nome;
		this.rabo = rabo;
		this.idade = idade;
	}

}
