package exercicio1.entities;

import exercicio1.interfaces.PagamentoCartao;

public class CartaoBandeiraMaster implements PagamentoCartao {
    @Override
    public void pagamentoDebito() {
        System.out.printf("Pagamento via Débito %n, Pago com Master");
    }

    @Override
    public void pagamentoCredito() {
        System.out.printf("Pagamento via Crédito %n, Pago com Master");
    }
}
