import java.util.ArrayList;
import java.util.List;

public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }
        if (valor < atual.valor) {
            return buscarRec(atual.esquerda, valor);
        } else {
            return buscarRec(atual.direita, valor);
        }
    }

    public List<Integer> emOrdem() {
        List<Integer> res = new ArrayList<>();
        emOrdemRec(raiz, res);
        return res;
    }

    private void emOrdemRec(Node atual, List<Integer> res) {
        if (atual == null) return;
        emOrdemRec(atual.esquerda, res);
        res.add(atual.valor);
        emOrdemRec(atual.direita, res);
    }

    public List<Integer> preOrdem() {
        List<Integer> res = new ArrayList<>();
        preOrdemRec(raiz, res);
        return res;
    }

    private void preOrdemRec(Node atual, List<Integer> res) {
        if (atual == null) return;
        res.add(atual.valor);
        preOrdemRec(atual.esquerda, res);
        preOrdemRec(atual.direita, res);
    }

    public List<Integer> posOrdem() {
        List<Integer> res = new ArrayList<>();
        posOrdemRec(raiz, res);
        return res;
    }

    private void posOrdemRec(Node atual, List<Integer> res) {
        if (atual == null) return;
        posOrdemRec(atual.esquerda, res);
        posOrdemRec(atual.direita, res);
        res.add(atual.valor);
    }
}