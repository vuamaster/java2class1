package bai2_6;

public class testmain2 {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(0, 3);
        MyPoint v2 = new MyPoint(4, 0);
        MyPoint v3 = new MyPoint(4, 3);

        Triangle triangle = new Triangle(v1, v2, v3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
    }
}
