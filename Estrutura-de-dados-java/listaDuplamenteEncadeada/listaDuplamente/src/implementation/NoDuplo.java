package implementation;

public class NoDuplo<T> {

    private T content;
    private NoDuplo<T> refNoAnterior;
    private NoDuplo<T> refNoPosterior;

   public NoDuplo(T content) {
       this.content = content;
   }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NoDuplo<T> getRefNoAnterior() {
        return refNoAnterior;
    }

    public void setRefNoAnterior(NoDuplo<T> refNoAnterior) {
        this.refNoAnterior = refNoAnterior;
    }

    public NoDuplo<T> getRefNoPosterior() {
        return refNoPosterior;
    }

    public void setRefNoPosterior(NoDuplo<T> refNoPosterior) {
        this.refNoPosterior = refNoPosterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "content=" + content +
                '}';
    }
}
