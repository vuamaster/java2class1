package buoi1b.bai2;

public class testsophuc {
    public static void main(String[] args) {
        SoPhuc s1 = new SoPhuc(3.0, 4.0);
        SoPhuc s2 = new SoPhuc(2.0, 2.0);
        System.out.println(s1);
        System.out.println(s1.cong(s2));
        System.out.println(s1.tru(s2));
        System.out.println(s1.nhan(s2));
        System.out.println(s1.chia(s2));
    }
}
