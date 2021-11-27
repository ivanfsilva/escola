package br.com.ivanfsilva.escola.aplicacao.indicacao;

import br.com.ivanfsilva.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara( Aluno aluno );
}
