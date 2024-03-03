import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        int carimbadas = sc.nextInt();
        int compradas = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> figurinhas = new ArrayList<>();
        figurinhas = remove(figurinhas);
        int falta = carimbadas;

        for (int i = 0; i < carimbadas; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        for (int i = 0; i < compradas; i++) {
            int a = sc.nextInt();
            figurinhas.add(a);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < figurinhas.size(); k++) {
                if (list.get(i) == figurinhas.get(k)) {
                    falta--;
                    break;
                }
            }
        }

        System.out.println(falta);
        sc.close();
    }

    public static List<Integer> remove(List<Integer> b) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {

            if (!a.contains(b.get(i))) {
                a.add(b.get(i));
            }

        }

        return a;
    }

}
