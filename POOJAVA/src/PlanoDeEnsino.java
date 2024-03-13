
public class PlanoDeEnsino {
	private String materia;
	private String cont_programatico;
	private String crit_avaliacao;
	private String bibliografia;
	
	//construtor
	PlanoDeEnsino() {}
	
	//construtor
	PlanoDeEnsino(String materia, String cont_programatico, String crit_avaliacao, String bibliografia ){
		this.materia = materia;
		this.cont_programatico = cont_programatico;
		this.crit_avaliacao = crit_avaliacao;
		this.bibliografia = bibliografia;
	}
	
	 public void setMateria(String materia){
		this.materia = materia;
	}
	 
	 public String getMateria(String materia) {
		 return materia;
	 }
	 
	 public void setCont_programatico(String cont_programatico){
			this.cont_programatico = cont_programatico;
		}
	 
	 public String getCont_programatico(String cont_programatico) {
			 return cont_programatico;
		 }
	 
	 public void setCrit_Avaliacao(String crit_avaliacao){
			this.crit_avaliacao = crit_avaliacao;
		}
	 
	 public String getCrit_avaliacao(String crit_avaliacao) {
			 return crit_avaliacao;
		 }
	 public void setBibliografia(String bibliografia) {
		 this.bibliografia =  bibliografia;
	 }
	 
	 public String getBibliografia() {
		 return bibliografia;
	 }
	
	
}
