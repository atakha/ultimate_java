import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p)  // if same address
            return true; 
        if(!(p instanceof Point))
            return false;

        Point input = (Point)p; //down cast for overriding
        return this.x == input.x && this.y == input.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}