package br.com.ivanfsilva.escola.gamificacao.infra.selos;

import br.com.ivanfsilva.escola.academico.dominio.aluno.Cpf;
import br.com.ivanfsilva.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.ivanfsilva.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar( Selo selo ) {
        this.selos.add( selo );
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(Cpf cpf) {
        return this.selos
                .stream()
                .filter( s -> s.getCpfDoAluno().equals( cpf ) )
                .collect( Collectors.toList() );
    }
}
