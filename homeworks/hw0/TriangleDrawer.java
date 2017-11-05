public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int x = 0;
        while (x <= N) {
            int y = 0;
            while (y < x) {
                System.out.print('*');
                y = y + 1;
            }
            System.out.println();
            x = x + 1;
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}