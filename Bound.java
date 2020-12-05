import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bound implements Comparable<Bound> {
    private int left;
    private int right;
    private int top;
    private int bottom;
    private int child_num;
    private boolean isRoot = false;
    private ArrayList<Bound> children = new ArrayList<Bound>();

    public Bound(int r, int l, int t, int b) {
        this.left = l;
        this.right = r;
        this.top = t;
        this.bottom = b;
    }

    public int getLeft() {
        return this.left;
    }

    @Override
    public int compareTo(Bound b) {
        int compare_left = b.getLeft();

        return this.left - compare_left;
    }

    public void Insert(int x, int y) {
        boolean isInBound = true;
        if (x > right) {
            right = x;
            isInBound = false;
        }

        if (x < left) {
            left = x;
            isInBound = false;
        }

        if (y > bottom) {
            isInBound = false;
            bottom = y;
        }
        if (y < top) {
            isInBound = false;
            top = y;
        }
        if (isInBound) {
            for (int i = 0; i < children.size(); ++i) {
                children.get(i).Insert(x, y);
            }
        } else {
            // new child is not in boundary
            createChild(x, y);
            isSplit();
        }

    }

    private void createChild(int x, int y) {
        // create new one list
        Bound bound;
        if (children.size() <= 0) {
            bound = new Bound(left, right, top, bottom);
            isRoot = true;
        } else
            bound = new Bound(x, x, y, y);
        children.add(bound);

    }

    private void isSplit() {
        // System.out.println(this.children.size());
        if (this.children.size() >= 5) {
            Collections.sort(children);
            // for (int i = 0; i < this.children.size(); ++i) {
            // System.out.println(this.children.get(i).getLeft());
            // }

        }
    }
}
