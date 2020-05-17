public class Node {
    int value;
    Node left;
    Node right;

    public Node find(int v) {
        Node current = this;
        while (current != null)
        {
            if (v > current.value) {
                current = current.right;
            }else if (v < current.value) {
                current = current.left;
            }else { // v == n.value
                return current;
            }
        }
        return null;
    }

}
