package listaEncadeada.componentes;

public class No<T> {

    private T object;
    private No<T> refProximoNo;

    public No() {
        refProximoNo = null;
    }

    public No(T object) {
        this.object = object;
        refProximoNo = null;
    }

    public No(T object, No refProximoNo) {
        this.object = object;
        this.refProximoNo = refProximoNo;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }

    public String toStringEncadeado() {
        StringBuilder sb = new StringBuilder();
        sb.append("No{" + "object=").append(object).append('}');
        if(refProximoNo != null) {
            sb.append("->").append(refProximoNo.toString());
        } else {
          sb.append("->null");
        }
        return sb.toString();
    }
}
