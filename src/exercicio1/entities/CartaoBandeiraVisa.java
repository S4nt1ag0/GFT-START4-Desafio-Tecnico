package exercicio1.entities;

import exercicio1.interfaces.PagamentoCartao;

public class CartaoBandeiraVisa implements PagamentoCartao {
    @Override
    public void pagamentoDebito() {
        System.out.printf("Pagamento via Débito %n, Pago com Visa");
    }

    @Override
    public void pagamentoCredito() {
        System.out.printf("Pagamento via Crédito %n, Pago com Visa");
    }
}
