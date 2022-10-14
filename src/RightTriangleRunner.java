public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3,4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double tri1hypo = tri1.hypotenuse();
        double tri2hypo = tri2.hypotenuse();
        System.out.println(tri1hypo);
        System.out.println(tri2hypo);
    }
}
