package listaEncadeada.componentes;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.add(1);
        listaEncadeada.add(2);
        listaEncadeada.add(3);
        listaEncadeada.add(4);
        listaEncadeada.add(5);
        listaEncadeada.add(6);

        System.out.println(listaEncadeada);
        System.out.println("Posição 0 = " + listaEncadeada.get(0));

        System.out.println(listaEncadeada.remove(0));

        System.out.println(listaEncadeada);
    }
}
