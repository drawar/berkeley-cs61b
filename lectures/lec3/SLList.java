public class SLList {

    /** The first item if it exists is at sentinel.next */
    private IntNode sentinel;
    private int size;
    
    /** Creates an empty list. */
    public SLList() {
        /** Any number is fine, doesn't have to be 0. */
        sentinel = new IntNode(0, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public void addLast(int x) {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
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

    public int cachedSize() {
        return size;
    }
 

    public int getFirst() {
        return sentinel.next.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(10);
        L.addLast(5);
        L.addFirst(30);
        //System.out.println(L.getFirst());
        IntNode cur = L.first;
        while (cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
        System.out.println(L.cachedSize());
    }
}