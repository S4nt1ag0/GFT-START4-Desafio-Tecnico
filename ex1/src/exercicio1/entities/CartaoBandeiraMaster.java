package exercicio1.entities;

import exercicio1.interfaces.PagamentoCartao;

public class CartaoBandeiraMaster implements PagamentoCartao {
    @Override
    public void pagamentoDebito() {
        System.out.printf("Pagamento via Débito, Pago com Master %n");
    }

    @Override
    public void pagamentoCredito() {
        System.out.printf("Pagamento via Crédito, Pago com Master %n");
    }
}
