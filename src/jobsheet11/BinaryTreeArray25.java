package jobsheet11;

public class BinaryTreeArray25 {
    int[] data;
    int idxLast;

    public BinaryTreeArray25() {
        data = new int[10];
    }
    
    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1); 
            System.out.print(data[idxStart] + " "); 
            traverseInOrder(2 * idxStart + 2); 
        }
    }
}
