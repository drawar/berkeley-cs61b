public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        //nt size = L.size();
        if (L == null) {
            return L;
        }

        IntList incr = new IntList(L.first + x, incrList(L.rest, x));
        return incr;      
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        if (L == null) {
            return L;
        }

        IntList dincr = L;
        while (dincr != null) {
            dincr.first += x;
            dincr = dincr.rest;
        }
        return dincr;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L.size());
        //System.out.println(L.get(0));
        //System.out.println(L.get(1));

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        IntList Q = incrList(L, 3);
        IntList curL = L;
        while (curL != null) {
            System.out.println(curL.first);
            curL = curL.rest;
        }
        System.out.println();
        IntList curQ = Q;
        while (curQ != null) {
            System.out.println(curQ.first);
            curQ = curQ.rest;
        }
        System.out.println();
        IntList R = dincrList(L, 3);
        IntList curR = L;
        while (curR != null) {
            System.out.println(curR.first);
            curR = curR.rest;
        }              
        //System.out.println(dincrList(L, 3));        
    }
}