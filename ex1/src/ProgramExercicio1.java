import exercicio1.entities.CartaoBandeiraMaster;
import exercicio1.entities.CartaoBandeiraVisa;
import exercicio1.interfaces.PagamentoCartao;

public class ProgramExercicio1 {
    public static void main(String[] args) {
        PagamentoCartao cartaoBandeiraMaster = new CartaoBandeiraMaster();
        PagamentoCartao cartaoBandeiraVisa = new CartaoBandeiraVisa();

        cartaoBandeiraMaster.pagamentoDebito();
        cartaoBandeiraMaster.pagamentoCredito();

        cartaoBandeiraVisa.pagamentoDebito();
        cartaoBandeiraVisa.pagamentoCredito();

    }
}
