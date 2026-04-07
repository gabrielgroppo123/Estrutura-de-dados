public class ListaEncadeadaDupla <Tipo>{
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeadaDupla(){
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public void adiciona(Tipo elemento){
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null){
            this.inicio = celula;
            this.fim = celula;
        }
        else{
            celula.setAnterior(this.fim);
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    public No buscar(int posicao){
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(Tipo elemento){
        No atual = this.inicio;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)){
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                }
                else if (atual == inicio){
                    this.inicio = atual.getProximo();
                    this.inicio.setAnterior(null);

                }
                else if (atual == fim){
                    this.fim = atual.getAnterior();
                    this.fim.setProximo(null);
                }
                else {
                    No<Tipo> anterior =  atual.getAnterior();
                    No<Tipo> proximo = atual.getProximo();
                    anterior.setProximo(proximo);
                    proximo.setAnterior(anterior);
                }

                this.tamanho--;
            }
            //anterior = atual;
            atual = atual.getProximo();

        }
    }
    @Override
    public String toString() {
        String resultado = "ListaEncadeadaDupla: ";

        No<Tipo> atual = this.inicio;

        while (atual != null) {
            resultado += atual.toString() + " -> ";
            atual = atual.getProximo();
        }

        resultado += "null";

        return resultado;
    }
}
