public class SelectionSorteTime {
    public static void main(String[] args) {
        int[] vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        long inicio = System.currentTimeMillis();
        int menor, aux;

        for (int i = 0; i < vetor.length; i++) {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo "+ (fim-inicio));
    }
}