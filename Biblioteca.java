package Lista_execicio_23_10;

public class Biblioteca {
	  private String nome;
	  public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	private Livro livro;

	  public Biblioteca(String nome,Livro livro) {
		  this.nome=nome;
		  this.livro=livro;
		  	  }
	  public void exibirInfo() {
			System.out.print("Detalhes informações do livo");;
}
}

