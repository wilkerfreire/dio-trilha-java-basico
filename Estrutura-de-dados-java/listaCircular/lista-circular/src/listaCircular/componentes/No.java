package listaCircular.componentes;

public class No<T> {

    private T content;
    private No<T> refNoProximo;

    public No (T content) {
        this.refNoProximo = null;
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public No<T> getRefNoProximo() {
        return refNoProximo;
    }

    public void setRefNoProximo(No<T> refNoProximo) {
        this.refNoProximo = refNoProximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "content=" + content +
                '}';
    }
}
