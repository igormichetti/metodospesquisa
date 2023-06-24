// Criado por IGOR MICHETTI e IEDA MARILIA DOS ANJOS AZEVEDO
public class Lista<T> {

    private No<T> primeiro;


    public No<T> getPrimeiro() {
        return this.primeiro;
    }

    public void inserePrimeiro(T info) {
        No<T> novoNo = new No<T>(info);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void insereDepois(int i, T info) {
        No<T> novoNo = new No<T>(info);
        No<T> atual = primeiro;
        int count = 0;
    
        while (atual != null) {
            if (count == i) {
                novoNo.setProximo(atual.getProximo());
                atual.setProximo(novoNo);
                return;
            }
            atual = atual.getProximo();
            count++;
        }
    
        throw new IndexOutOfBoundsException("Posição inválida: " + i);
    }

    public void insereUltimo(T info) {
        No<T> novoNo = new No<T>(info);

        if (vazia()) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public No<T> removePrimeiro() {
        if (vazia()) {
            throw new IllegalStateException("Lista vazia");
        }

        No<T> removido = primeiro;
        primeiro = primeiro.getProximo();
        removido.setProximo(null);
        return removido;
    }

    public No<T> removeUltimo() {
        if (vazia()) {
            throw new IllegalStateException("Lista vazia");
        }

        No<T> removido;
        if (primeiro.getProximo() == null) {
            removido = primeiro;
            primeiro = null;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            removido = atual.getProximo();
            atual.setProximo(null);
        }

        return removido;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public No<T> remove(No<T> no) {
        if (no == null) {
            throw new IllegalArgumentException("Nó inválido");
        }

        if (vazia()) {
            throw new IllegalStateException("Lista vazia");
        }

        if (no == primeiro) {
            return removePrimeiro();
        }

        No<T> atual = primeiro;
        while (atual.getProximo() != null && atual.getProximo() != no) {
            atual = atual.getProximo();
        }

        if (atual.getProximo() == null) {
            throw new IllegalArgumentException("Nó não encontrado na lista");
        }

        No<T> removido = atual.getProximo();
        atual.setProximo(removido.getProximo());
        removido.setProximo(null);
        return removido;
    }


    public void mostrar() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
}
}