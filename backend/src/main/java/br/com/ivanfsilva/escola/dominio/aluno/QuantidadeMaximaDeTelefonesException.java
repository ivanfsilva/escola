package br.com.ivanfsilva.escola.dominio.aluno;

public class QuantidadeMaximaDeTelefonesException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QuantidadeMaximaDeTelefonesException() {
        super("Número máximo de telefones cadastrados por aluno são dois.");
    }
}
