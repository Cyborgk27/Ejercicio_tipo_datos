import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int x=1;
        double y=2.2;
        char letter ='a';
        String name = "Kevin";
        boolean flag=true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(letter);
        System.out.println(name);
        System.out.println(flag);

        List<Integer>lista = new ArrayList<>();

        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);

        for(Integer numero : lista){
            System.out.println(numero);
        }
    }
}
