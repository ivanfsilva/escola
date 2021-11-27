package br.com.ivanfsilva.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Cpf cpf;
    private String nome;

    private String senha;
    private Email email;

    private List< Telefone > telefones = new ArrayList<>();

    public Aluno( Cpf cpf, String nome, Email email ) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone( String ddd, String numero ) {
        if ( telefones.size() == 2 ) {
            throw new IllegalArgumentException( "Número máximo de telefones atingido!" );
        }
        this.telefones.add( new Telefone( ddd, numero ) );
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf( Cpf cpf ) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail( Email email ) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
