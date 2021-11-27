package br.com.ivanfsilva.escola.gamificacao.dominio.selo;

import br.com.ivanfsilva.escola.academico.dominio.aluno.Cpf;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar( Selo selo );

    List<Selo> selosDoAlunoDeCPF( Cpf cpf );
}
