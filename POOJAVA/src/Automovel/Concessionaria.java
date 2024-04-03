package Automovel;
import javax.swing.JOptionPane;

public class Concessionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovel auto = new Automovel();
		
		String marca, modelo, preço, cor;
		double pc;
		
		marca = JOptionPane.showInputDialog("Digite a marca:" );
		modelo = JOptionPane.showInputDialog("Digite a modelo:" );
		preço = JOptionPane.showInputDialog("Digite a preco:" );
		cor = JOptionPane.showInputDialog("Digite a cor:" );
		
		pc = Double.parseDouble(preço);
		
		
		auto.setMarca(marca);
		auto.setModelo(modelo);
		auto.setPreço(pc);
		auto.setCor(cor);
		
		auto.Informa_automovel();
	}
}
