package model;

public class EstudanteTecnico extends Estudante {
	    public EstudanteTecnico(String ra, String nome, String email, 
	    		float mediaNotas, int qtdAprovacoes) {
	        super(ra, nome, email, mediaNotas, qtdAprovacoes);
	       
	    }
	    public float percentualRendimento() {
	        return super.percentualRendimento();
	    }

	    public float percentualProgressao() {
	        return super.percentualProgressao();
	    
}
}
 

