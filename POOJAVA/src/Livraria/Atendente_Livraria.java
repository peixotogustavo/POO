package Livraria;

import javax.swing.JOptionPane;

public class Atendente_Livraria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria: digite 1 para Romance \n 2 para Espirita \n 3 para Informatica");
		
		a = JOptionPane.showInputDialog(null,"Codigo");
		b = JOptionPane.showInputDialog(null,"Editora");
		c = JOptionPane.showInputDialog(null,"Autor");
		d = JOptionPane.showInputDialog(null,"Livro");
		e = JOptionPane.showInputDialog(null,"quantidade");
		i = JOptionPane.showInputDialog(null,"preço");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.setEditora(a);
		cultura.setAutor(c);
		cultura.setLivro(d);
		cultura.setQuantidade(g);
		cultura.setPreco(h);
		
		cultura.Informa_Livros(f);
		
	}

}
