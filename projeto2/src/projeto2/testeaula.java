package projeto2;

public class testeaula {
	
	
	private String  nome;
	
	int maioridade = 18;
	
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
		
		
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		
		
		System.out.println("maioridade é =" + maioridade);
	}

}
