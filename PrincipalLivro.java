package Lista_execicio_23_10;

public class PrincipalLivro {
	public static void main(String[] args) {

	Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
	Biblioteca biblioteca = new Biblioteca("Municipal Dr.Júlio Prestes de Albuquerque", livro1);

	biblioteca.exibirInfo();
	System.out.println("Titulo: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor()+ ("\nBiblioteca: ")+biblioteca.getNome());

	}
}	
