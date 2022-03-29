import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProgramEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de itens a ser armazenada:");
        try{
            int N = sc.nextInt();
            Set<Integer> vector = new TreeSet<>();
            for(int i = 0; i<N; i++){
                int tempValues = sc.nextInt();
                vector.add(tempValues);
            }

            for (int value :vector) {
                System.out.println(value);
            }

        }catch (RuntimeException e){
            System.out.println("invalid Value");
            e.printStackTrace();
        }



    }
}
