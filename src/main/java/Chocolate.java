public class Chocolate{
    public static int breakChocolate(int n, int m) {
        int breaks = n * m - 1;
        return Math.max(breaks, 0);
    }
}