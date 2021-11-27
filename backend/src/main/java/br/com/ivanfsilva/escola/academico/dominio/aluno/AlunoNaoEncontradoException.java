package br.com.ivanfsilva.escola.academico.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontradoException(Cpf cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}

}
