//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lista {
    public static void main(String[] args) {
        ListaEncadeadaDupla<String> lista = new ListaEncadeadaDupla<>();

        lista.adiciona("Claudio");
        lista.adiciona("Gustavo");
        lista.adiciona("Ze");

        System.out.println(lista);

        lista.remover("Gustavo");
        System.out.println(lista);

        System.out.println("Inicio da lista = " + lista.buscar(0).getElemento());
    }
}