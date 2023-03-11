package listaCircular.componentes;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }

    public void add(T content) {
        No<T> novoNo = new No<>(content);
        if(this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setRefNoProximo(this.cauda);
        } else {
            novoNo.setRefNoProximo(this.cauda);
            this.cabeca.setRefNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if(index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice digitado é maior que o tamanho da lista.");
        }
        No<T> noAux = this.cauda;
        if(index == 0) {
            this.cauda = this.cauda.getRefNoProximo();
            this.cabeca.setRefNoProximo(this.cauda);
        } else if(index == 1) {
            this.cauda.setRefNoProximo(this.cauda.getRefNoProximo().getRefNoProximo());
        } else {
            for(int i = 0; i < index-1; i++) {
                noAux = noAux.getRefNoProximo();
            }
            noAux.setRefNoProximo(noAux.getRefNoProximo().getRefNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getContent();
    }

    private No<T> getNo(int index) {
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        if(index == 0)
            return cauda;
        No<T> noAux = this.cauda;
        for(int i = 0; i < index; i++) {
            noAux = noAux.getRefNoProximo();
        }
        return noAux;
    }

    @Override
    public String toString() {
        No<T> noAux = this.cauda;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.tamanhoLista; i++) {
            sb.append("[No{conteudo=").append(noAux.getContent()).append("}]----->");
            noAux = noAux.getRefNoProximo();
        }
        sb.append(this.isEmpty() ? "[]" : "(Retorna ao início)");
        return sb.toString();
    }

}
