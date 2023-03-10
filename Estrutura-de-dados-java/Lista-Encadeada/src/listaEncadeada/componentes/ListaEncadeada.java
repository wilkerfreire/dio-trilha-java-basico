package listaEncadeada.componentes;

public class ListaEncadeada<T> {

    private No<T> refNoEntrada;

    public ListaEncadeada() {
        refNoEntrada = null;
    }

    public T get(int index) {
        return getNo(index).getObject();
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAux = refNoEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getRefProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivor = getNo(index);

        if(index == 0) {
            refNoEntrada = noPivor.getRefProximoNo();
            return noPivor.getObject();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setRefProximoNo(noPivor.getRefProximoNo());
        return noPivor.getObject();
    }

    public void add(T content) {
        No<T> novoNo = new No<>(content);
        if(isEmpty()) {
            refNoEntrada = novoNo;
            return;
        }
        No<T> noAux = refNoEntrada;
        for(int i = 0; i < this.size()-1; i++) {
            noAux = noAux.getRefProximoNo();
        }
        noAux.setRefProximoNo(novoNo);
    }

    public int size() {
        if(isEmpty()) {
            return 0;
        }
        int tamanhoLista = 0;
        No<T> referenciaAux = refNoEntrada;
        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;
                if(referenciaAux.getRefProximoNo() != null) {
                    referenciaAux = referenciaAux.getRefProximoNo();
                } else {
                     break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if(index >= this.size())  {
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("Índice " + index + " não existe na lista. Essa lista só vai até o índice " + lastIndex);
        }
    }

    public boolean isEmpty() {
        return refNoEntrada == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> noAux = refNoEntrada;
        for(int i = 0; i < this.size(); i++) {
            sb.append("No{conteudo=").append(noAux.getObject()).append("}----->");
            noAux = noAux.getRefProximoNo();
        }
        sb.append("null");

        return sb.toString();
    }

}
