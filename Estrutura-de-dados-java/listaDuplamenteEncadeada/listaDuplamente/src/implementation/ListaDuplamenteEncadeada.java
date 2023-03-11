package implementation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = getNo(index).getRefNoPosterior();
            if(primeiroNo != null)
                primeiroNo.setRefNoAnterior(null);
        } else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getRefNoAnterior().setRefNoPosterior(noAux.getRefNoPosterior());
            if(noAux != ultimoNo) {
                noAux.getRefNoPosterior().setRefNoAnterior(noAux.getRefNoAnterior());
            } else {
                ultimoNo = noAux;
            }
        }
        this.tamanhoLista--;
    }

    public void add(T content, int index) {
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(content);
        novoNo.setRefNoPosterior(noAux);

        if(novoNo.getRefNoPosterior() != null) {
            novoNo.setRefNoAnterior(noAux.getRefNoAnterior());
            novoNo.getRefNoPosterior().setRefNoAnterior(novoNo);
        } else {
            novoNo.setRefNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getRefNoAnterior().setRefNoPosterior(novoNo);
        }
        this.tamanhoLista++;
    }

    public void add(T content) {
        NoDuplo<T> novoNo = new NoDuplo<>(content);
        novoNo.setRefNoPosterior(null);
        novoNo.setRefNoAnterior(ultimoNo);
        if(primeiroNo == null)
            primeiroNo = novoNo;
        if(ultimoNo != null)
            ultimoNo.setRefNoPosterior(novoNo);
        ultimoNo = novoNo;
        this.tamanhoLista++;
    }

    public T get(int index) {
        return getNo(index).getContent();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getRefNoPosterior();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public String toString() {
        NoDuplo<T> noDuplo = primeiroNo;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size(); i++) {
            sb.append("[No{objeto=").append(noDuplo.getContent()).append("}]----->");
            noDuplo = noDuplo.getRefNoPosterior();
        }
        sb.append("null");
        return sb.toString();
    }
}
