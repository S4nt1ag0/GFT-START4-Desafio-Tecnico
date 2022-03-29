import entities.Produto;

public class ProgramEx3 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Tv Samsung 50 polegadas",3000.00,false,0.1);
        produto1.reajuste();

        Produto produto2 = new Produto("Cama Box Ortobom",1800.00,true,0.2);
        produto2.reajuste();
    }
}
