package model;

public class EstudantePrincipal {
	    public static void main(String[] args) {
	  
	    	
	        EstudanteTecnicoControllerImpl tecnicoController = new EstudanteTecnicoControllerImpl();
	        EstudanteTecnico estudanteTecnico = new EstudanteTecnico(null, null, null, 0, 0);
	        estudanteTecnico.setRa("123");
	        estudanteTecnico.setNome("João");
	        estudanteTecnico.setEmail("joao@example.com");
	        estudanteTecnico.setMediaNotas(7.5f);
	        estudanteTecnico.setQtdAprovacoes(4);
	        tecnicoController.cadastrarEstudante(estudanteTecnico);

	        EstudanteSuperiorControllerImpl superiorController = new EstudanteSuperiorControllerImpl();
	        EstudanteSuperior estudanteSuperior = new EstudanteSuperior(null, null, null, 0, 0, null, 0);
	        estudanteSuperior.setRa("456");
	        estudanteSuperior.setNome("Maria");
	        estudanteSuperior.setEmail("maria@example.com");
	        estudanteSuperior.setMediaNotas(8.3f);
	        estudanteSuperior.setQtdAprovacoes(7);
	        estudanteSuperior.setInstituicaoSegundoGrau("Colegio ABC");
	        estudanteSuperior.setAnoConclusaoSegundoGrau(2018);
	        superiorController.cadastrarEstudante(estudanteSuperior);
	    }
	}

