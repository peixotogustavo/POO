package Livraria;
import javax.swing.JOptionPane;
public class Livraria {
	private String editora;
	private String autor;
	private String livro;
	private int quantidade;
	private double preco;
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Informa_Livros(int codigo) {
		
		switch (codigo) {
		
		case 1: JOptionPane.showMessageDialog(null, "Categoria Romance \n" +
		"Livro: " + livro +
		"\n Editora: " + editora +
		"\n Autor: " + autor +
		"\n Quantidade: " + quantidade +
		"\n Preco R$: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;		
		
		case 2: JOptionPane.showMessageDialog(null, "Categoria Romance \n" +
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor +
				"\n Quantidade: " + quantidade +
				"\n Preco R$: " + preco,"", JOptionPane.PLAIN_MESSAGE);
				break;		
		
		case 3: JOptionPane.showMessageDialog(null, "Categoria Romance \n" +
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor +
				"\n Quantidade: " + quantidade +
				"\n Preco R$: " + preco,"", JOptionPane.PLAIN_MESSAGE);
				break;		
				
		default: System.out.println("codigo nao corresponde a nenhuma categoria de livro");
	}	
}
}
