package Desafio_Estacionamento;

public class Excluir {

    private boolean excluir;
    private boolean nao_excluir;

    // Construtor

    public Excluir(boolean excluir, boolean nao_excluir) {
        this.excluir = excluir;
        this.nao_excluir = nao_excluir;
    }
    public boolean isExcluir() {
        return excluir;
    }
    public boolean isNao_excluir() {
        return nao_excluir;
    }
}

