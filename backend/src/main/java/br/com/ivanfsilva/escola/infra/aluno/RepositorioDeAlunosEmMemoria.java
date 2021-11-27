package br.com.ivanfsilva.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.AlunoNaoEncontradoException;
import br.com.ivanfsilva.escola.dominio.aluno.Cpf;
import br.com.ivanfsilva.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List< Aluno > matriculados = new ArrayList<>();
	
	@Override
	public void matricular( Aluno aluno ) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF( Cpf cpf ) {
		return this.matriculados.stream()
				.filter( a -> a.getCpf().equals( cpf.getNumero() ) )
				.findFirst()
				.orElseThrow( () -> new AlunoNaoEncontradoException( cpf ) );
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
