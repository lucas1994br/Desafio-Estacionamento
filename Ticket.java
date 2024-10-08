package Desafio_Estacionamento;

public class Ticket {

    private int ID;
    private double Valor;

    // Construtor

    public Ticket(int ID, double Valor){

        this.ID = ID;
        this.Valor = Valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }
}
