// Criado por IGOR MICHETTI e IEDA MARILIA DOS ANJOS AZEVEDO
public class No<T> {
    
    private T info;
    private No<T> proximo;

    public No(T info) {
        this.info = info;
        this.proximo = null;
    }

    public No(T info, No<T> proximo) {
        this.info = info;
        this.proximo = proximo;
    }

    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}