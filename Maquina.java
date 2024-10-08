package Desafio_Estacionamento;

import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) {

        Scanner novo = new Scanner(System.in);

        Saldo saldo = new Saldo(0.00, 0.00);
        Ticket ticket = null;
        Controlar controlar = null;
        Receber receber = null;
        Excluir excluir = null;
        boolean saindo = true;

        while (saindo) {
            System.out.println("Estacionar Play o cliente é o nosso rei");
            System.out.println("1. Gerar ticket");
            System.out.println("2. Pagar ticket");
            System.out.println("3. Receber pagamento");
            System.out.println("4. Remover Saldo");
            System.out.println("5. Ver Saldo");
            System.out.println("6. Sair");

            System.out.println("Escolha uma das opções: ");
            int opcoes = novo.nextInt();

            switch (opcoes){
                case 1: // Gerar ticket

                    System.out.println("Digite o ID do seu ticket: ");
                    int id = novo.nextInt();
                    System.out.println("Coloque o valor do seu ticket ");
                    double valorTicket = novo.nextDouble();
                    ticket = new Ticket(1,valorTicket);
                    controlar = new Controlar(false,true);
                    System.out.println("Ticket gerado com valor de R$ " + ticket.getValor());
                    break;

                case 2: // Pagar ticket

                    if (ticket != null && controlar != null && controlar.isNao_pago()) {
                        System.out.print("Digite o valor para pagamento: ");
                        double valorPagamento = novo.nextDouble();
                        if (valorPagamento >= ticket.getValor()) {
                            controlar = new Controlar(true, false); // Marcando como pago
                            saldo = new Saldo(saldo.getSaldoAtual(), saldo.getSaldoAtual() + ticket.getValor());
                            System.out.println("Pagamento realizado com sucesso! Troco: " + (valorPagamento - ticket.getValor()));
                        } else {
                            System.out.println("Valor insuficiente para pagamento.");
                        }
                    } else {
                        System.out.println("Nenhum ticket para pagar ou já foi pago.");
                    }
                    break;

                case 3: // Receber pagamento

                    if (ticket != null && controlar != null && controlar.isPago()) {
                        receber = new Receber(ticket.getValor(), ticket.getValor());
                        System.out.println("Pagamento recebido: R$ " + receber.getRecebido());
                    } else {
                        System.out.println("Nenhum pagamento foi feito para receber.");
                    }
                    break;

                case 4: // Remover Saldo

                    if (ticket != null) {
                        System.out.print("Tem certeza que deseja excluir o ticket? (1 para sim, 0 para não): ");
                        int confirmacao = novo.nextInt();
                        if (confirmacao == 1) {
                            excluir = new Excluir(true, false);
                            ticket = null;
                            controlar = null;
                            System.out.println("Ticket excluído com sucesso.");
                        } else {
                            excluir = new Excluir(false, true);
                            System.out.println("Exclusão cancelada.");
                        }
                    } else {
                        System.out.println("Nenhum ticket para excluir.");
                    }
                    break;

                case 5:
                    System.out.println("Saldo Atual da Máquina: R$ " + saldo.getSaldoAtual());
                    break;

                case 6:
                    System.out.println("Saindo do sistema");
                    saindo = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente. ");
                    break;
                    }
            System.out.println();
            }

        novo.close();
        }

    }
