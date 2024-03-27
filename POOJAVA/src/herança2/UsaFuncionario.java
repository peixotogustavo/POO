package herança2;

import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		PessoaJuridica PJ = new PessoaJuridica();
		
		String opcao, nome, rg, identificaCartao, cnpj;
		int x;
		
		opcao = JOptionPane.showInputDialog("Digite 1 se o contribuinte é Pessoa Fisica \n Digite 2 se é Pessoa Juridica");
		
		//conversao de string para flutuante:
		
		x = Integer.parseInt(opcao);
		
		if(opcao.length()== 1) {
			switch(x) {
			
			case 1: {
				nome = JOptionPane.showInputDialog("Escreva o nome do contribuinte");
				rg = JOptionPane.showInputDialog("Escreva o RG do contribuinte");
				identificaCartao = JOptionPane.showInputDialog("Escreva a identificação do cartão do contribuinte");
				
				funcionario.setNome(nome);
				funcionario.setRg(rg);
				funcionario.setCartao(identificaCartao);
				
				System.out.println("Nome:" + funcionario.getNome());
				System.out.println("RG:" + funcionario.getRg());
				System.out.println("Cartao:" + funcionario.getCartao());
				
				break;
			}
			
			case 2: {
				nome = JOptionPane.showInputDialog("Escreva o nome do contribuinte");
				cnpj = JOptionPane.showInputDialog("Escreva o CNPJ do contribuinte");
				identificaCartao = JOptionPane.showInputDialog("Escreva a identificação do cartão do contribuinte");
				
				funcionario.setNome(nome);
				PJ.setCnpj(cnpj);
				funcionario.setCartao(identificaCartao);
				
				System.out.println("Nome:" + funcionario.getNome());
				System.out.println("CNPJ:" + PJ.getCnpj());
				System.out.println("Cartao:" + funcionario.getCartao());
				
				break;
			}
			}
		}
	}
}
