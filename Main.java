import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] valores = {18, 3, 10, 1, 6, 14, 4, 7, 131};
        System.out.print("Inserindo valores:");
        for (int v : valores) {
            System.out.print(" " + v);
            arvore.inserir(v);
        }
        System.out.println();

        List<Integer> emOrdem = arvore.emOrdem();
        System.out.print("Em ordem:");
        for (int v : emOrdem) System.out.print(" " + v);
        System.out.println();

        List<Integer> preOrdem = arvore.preOrdem();
        System.out.print("Pre-ordem:");
        for (int v : preOrdem) System.out.print(" " + v);
        System.out.println();

        List<Integer> posOrdem = arvore.posOrdem();
        System.out.print("Pos-ordem:");
        for (int v : posOrdem) System.out.print(" " + v);
        System.out.println();

        int buscar1 = 10;
        int buscar2 = 5;
        System.out.println("Buscar " + buscar1 + ": " + arvore.buscar(buscar1));
        System.out.println("Buscar " + buscar2 + ": " + arvore.buscar(buscar2));
    }
}