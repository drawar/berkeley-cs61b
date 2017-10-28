public class SLList {
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    public void addLast(int x) {
        IntNode last = new IntNode(x, null);
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = last;
    }
    /** Helper function:
     * returns the size of the list that starts at IntNode p.
     */
    private static int recursiveSize(IntNode p) {
        if (p.next == null) {
            return 1;
        }

        return 1 + recursiveSize(p.next);
    }

    public int recursiveSize() {
        return recursiveSize(first);
    }
    
    public int size() {
        int size = 0;
        IntNode p = first;
        while (p != null) {
            size += 1;
            p = p.next;
        }
        return size;
    }
 

    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(25);
        L.addLast(10);
        L.addLast(5);
        L.addFirst(30);
        //System.out.println(L.getFirst());
        IntNode cur = L.first;
        while (cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
        System.out.println(L.recursiveSize());
    }
}