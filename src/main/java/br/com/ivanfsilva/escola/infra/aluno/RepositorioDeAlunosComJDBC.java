package br.com.ivanfsilva.escola.infra.aluno;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;
import br.com.ivanfsilva.escola.dominio.aluno.Cpf;
import br.com.ivanfsilva.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.ivanfsilva.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC( Connection connection ) {
        this.connection = connection;
    }

    @Override
    public void matricular( Aluno aluno ) {
        try {
            String sql = "INSERT INTO aluno VALUES ( ?, ?, ? )";
            PreparedStatement ps = connection.prepareStatement( sql );

            ps.setString( 1, aluno.getCpf() );
            ps.setString( 2, aluno.getNome() );
            ps.setString( 3, aluno.getEmail() );

            ps.execute();

            sql = "INSERT INTO telefones VALUES( ?,? )";
            ps = connection.prepareStatement( sql );

            for (Telefone telefone : aluno.getTelefones() ) {
                ps.setString( 1, telefone.getDdd() );
                ps.setString( 2, telefone.getNumero() );

                ps.execute();
            }
        } catch ( SQLException e ) {
            throw new RuntimeException( e );
        }
    }

    @Override
    public Aluno buscarPorCPF( Cpf cpf ) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
