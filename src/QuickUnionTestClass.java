public class QuickUnionTestClass {
    public static void main(String[] args){
        QuickUnion quickUnion = new QuickUnion(6);
        if (quickUnion.isConnected(2,4)) System.out.println("Before: 2 and 4 connected");
        quickUnion.union(2,4);
        if (quickUnion.isConnected(2,4)) System.out.println("After: 2 and 4 connected");
    }
}
