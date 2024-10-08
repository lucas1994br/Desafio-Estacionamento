package Desafio_Estacionamento;

public class Controlar {

    private boolean pago;
    private boolean nao_pago;

    // Construtor
    public Controlar(boolean pago, boolean nao_pago) {
        this.pago = pago;
        this.nao_pago = nao_pago;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isNao_pago() {
        return nao_pago;
    }
}

