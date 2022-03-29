package entities;

public class Produto {
    private String descricao;
    private double valorReal;
    private boolean operacao;//false = acrescimo, true = desconto.
    private double percentual;
    private double valorFinal;

    public Produto(String descricao, double valorReal, boolean operacao, double percentual) {
        this.descricao = descricao;
        this.valorReal = valorReal;
        this.operacao = operacao;
        this.percentual = percentual;
    }

    public void reajuste(){
        if(operacao){
           this.valorFinal = this.valorReal - (this.valorReal*percentual);
        }else{
            this.valorFinal = this.valorReal + (this.valorReal*percentual);
        }

        System.out.println("O valor final do produto é: "+ this.valorFinal);
    }


}
