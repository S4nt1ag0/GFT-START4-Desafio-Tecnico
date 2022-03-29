import java.util.*;

public class ProgramEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de itens a ser armazenada (inteiro > 0):");
        try{
            int N = sc.nextInt();
            if(N<=0){
                System.out.println("Porfavor execute novamente e informe um valor valido");
                return;
            }
            //bom, não foi informado o tipo dos valores então tomei a liberdade de considerar eles inteiors
            Set<Integer> vector = new TreeSet<>();

            System.out.println("agora infome os valores do vetor: (somente numeros inteiros são permitidos!)");
            for(int i = 0; i<N; i++){
                int tempValues = sc.nextInt();
                vector.add(tempValues);
            }

            for (int value :vector) {
                System.out.println(value);
            }

        }catch (InputMismatchException e){
            System.out.println("Você digitou um valor invalido, execute o programa novamente");
        }finally {
            sc.close();
        }



    }
}
