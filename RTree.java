import java.util.ArrayList;
import java.util.Random;

public class RTree {
    private static int[] loc_x = new int[100];
    private static int[] loc_y = new int[100];
    private static int[] right_top = { 0, 500 };
    private static int[] left_bottom = { 500, 0 };
    private static int min_B = 4;// minimum bound

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(400) + 50;
        int y = random.nextInt(400) + 50;
        Bound bound = new Bound(x, x, y, y);
        bound.Insert(x, y);
        for (int i = 1; i < 50; ++i) {
            x = random.nextInt(400) + 50;
            y = random.nextInt(400) + 50;
            bound.Insert(x, y);
        }

        // Draw draw = new Draw(loc_x, loc_y, right_top, left_bottom);
        // draw.launchFrame();
        // System.out.println("right-top=(" + right_top[0] + "," + right_top[1] +
        // ")\n");
        // System.out.println("left_bottom=(" + left_bottom[0] + "," + left_bottom[1] +
        // ")\n");

    }

    public static void constructRTree(int bound) {

    }
}
