/* public class IntList {
    public int first;
    public IntList rest;

    public static void main(String[] args) {
        IntList l = new IntList();
        L.first = 5;
        L.rest = null;

        L.rest = new IntList();
        L.rest.first = 10;

        L.rest.rest = new IntList();
        L.rest.rest.first = 15;
    }
} */

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    public int iterativeSize() {
        IntList cur = this;
        int size = 0;
        while (cur != null) {
            cur = cur.rest;
            size = size + 1;
        }
        return size;
    }

    public int get(int i) {
        IntList cur = this;
        while (i > 0) {
            cur = cur.rest;
            i -= 1;
        }
        return cur.first;
    }

    public int recursiveGet(int i) {
        if (i == 0) {
            return this.first;
        }
        return rest.recursiveGet(i-1);
    }

    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l); 
        System.out.println(l.size());
        System.out.println(l.recursiveGet(2));
    }
}