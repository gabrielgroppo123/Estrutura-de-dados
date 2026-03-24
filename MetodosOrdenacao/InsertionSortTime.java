public class InsertionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[100000];
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

        }
        long inicio = System.currentTimeMillis();
        for (int i = 1; i < vetor.length ; i++) {
            aux = vetor[i];
            int j = i-1;
            while(j >=0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo " + (fim-inicio));
    }
}
