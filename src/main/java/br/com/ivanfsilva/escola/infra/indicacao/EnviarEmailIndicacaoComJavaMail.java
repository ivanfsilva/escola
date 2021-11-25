package br.com.ivanfsilva.escola.infra.indicacao;

import br.com.ivanfsilva.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.ivanfsilva.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara( Aluno aluno ) {
        // logia de envio de email com a lib Java Mail
    }
}
