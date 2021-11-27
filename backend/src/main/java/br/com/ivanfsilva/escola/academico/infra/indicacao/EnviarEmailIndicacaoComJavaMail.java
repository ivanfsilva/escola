package br.com.ivanfsilva.escola.academico.infra.indicacao;

import br.com.ivanfsilva.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.ivanfsilva.escola.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara( Aluno aluno ) {
        // logia de envio de email com a lib Java Mail
    }
}
