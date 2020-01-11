public class QuickUnion {

    private int[] id;

    /**
     * Constructor to initialize each array value as its own root
     * @param N
     */
    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Function to find the root of a value in the array
     * @param i
     * @return
     */
    private int root(int i){
        while(i != id[i]) i = id[i];
        return i;
    }

    /**
     * Function to find if two values are connected i.e have same root
     * @param p
     * @param q
     * @return
     */
    public boolean isConnected(int p,int q){
        return root(p) == root(q);
    }

    /**
     * Connect two values in the array
     * i.e Assign the first value,p, the root of the second,q
     * @param p
     * @param q
     */
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
