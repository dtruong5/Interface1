public class Clients implements Constants {
    public Clients() {
    }
    public static void main(String[] var0) {
        double var1 = 1.5D;
        System.out.printf("Area of circle is %.2f %s%n", 3.14D * var1 * var1, "sq.cm.");
        System.out.printf("Circumference of circle is %.2f %s%n", 6.28D * var1, "cm.");
        Clients c = new Clients();
        c.defaultMethod();
    }

}
