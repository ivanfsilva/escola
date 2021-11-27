package br.com.ivanfsilva.escola.academico.aplicacao.indicacao;

import br.com.ivanfsilva.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara( Aluno aluno );
}
