package one.digitalinnovation;

public class Program {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        System.out.println(pilha.isEmpty());

        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));

        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.push(new No(99));
        System.out.println(pilha);
    }

}
