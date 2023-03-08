package fila.componentes;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        refNoEntradaFila = null;
    }

    public T first() {
        if(!isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No noAuxiliar  = refNoEntradaFila;

        if(!isEmpty()) {
            while(true) {
                sb.append("[No{objeto=" + noAuxiliar.getObject() + "}]--->");
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    sb.append("null");
                    break;
                }
            }
        } else {
            sb.append("null");
        }

        return sb.toString();
    }

}
