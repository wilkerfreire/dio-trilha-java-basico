package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop() {
        if(!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------\n");
        sb.append("    Pilha\n");
        sb.append("-------------\n");

        No noAuxiliar = refNoEntradaPilha;

        while(true) {
            if (noAuxiliar != null) {
                sb.append("[No{dado: ").append(noAuxiliar.getDado()).append("]}\n");
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        sb.append("=============\n");
        return sb.toString();
    }
}
