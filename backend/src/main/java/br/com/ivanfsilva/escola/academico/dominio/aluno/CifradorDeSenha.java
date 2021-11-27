package br.com.ivanfsilva.escola.academico.dominio.aluno;

public interface CifradorDeSenha {

    String cifrarSenha( String senha );

    boolean validarSenhaCifrada( String senhaCifrada, String senha );
}
