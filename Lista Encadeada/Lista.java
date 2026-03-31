public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Claudio");
        lista.adiciona("Gustavo");
        lista.adiciona("Guilherme");
        lista.adiciona("Camila");
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da lista = " + lista.getFim().getElemento());
        lista.remover("Guilherme");
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da lista = " + lista.getFim().getElemento());


    }
}