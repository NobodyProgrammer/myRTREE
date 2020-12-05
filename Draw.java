import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

public class Draw extends JFrame {
    private int[] loc_x;
    private int[] loc_y;
    private int[] right_top;
    private int[] left_bottom;

    public Draw(int[] x, int[] y, int[] r_t, int[] l_b) {
        this.loc_x = x;
        this.loc_y = y;
        this.right_top = r_t;
        this.left_bottom = l_b;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; i < loc_x.length; ++i) {
            int r = 10;
            int x = loc_x[i] - r / 2;
            int y = loc_y[i] - r / 2;
            g.fillOval(x, y, r, r);

        }
        g.setColor(Color.blue);
        int width = right_top[0] - left_bottom[0];
        int height = left_bottom[1] - right_top[1];
        g.drawRect(left_bottom[0], right_top[1], width, height);

    }

    public void launchFrame() {
        this.setSize(500, 500);
        setLayout(null);
        setVisible(true);

    }
}
