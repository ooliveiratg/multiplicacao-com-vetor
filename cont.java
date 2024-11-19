public class cont {

    

    public static void main(String[] args) {

    int[] vetorA = new int[9];
    int[] vetorB = new int[9];
    int mult=3,cont=0;
    

        for(int i=0;i<=8;i++){

            vetorB[i]=i;
            vetorA[i]=i;
            vetorA[i]*=3;
            

            System.out.println(vetorB[i]+" x 3 = "+vetorA[i]);

        }

    }
}
