package Desafio_Estacionamento;

public class Saldo {

    private double SaldoAnterior;
    private double SaldoAtual;

    // Construtor

    public Saldo(double saldoAnterior, double saldoAtual) {
        SaldoAnterior = saldoAnterior;
        SaldoAtual = saldoAtual;
    }

    public double getSaldoAnterior() {
        return SaldoAnterior;
    }

    public double getSaldoAtual() {
        return SaldoAtual;
    }
}
