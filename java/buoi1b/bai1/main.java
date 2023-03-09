package buoi1b.bai1;

public class main {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(3);
        HinhTron hinhTron = new HinhTron(4.0);

        Drawable drawable =new Drawable();
        drawable.draw(hinhTron);
        drawable.draw((hinhVuong));
//        IHinhHoc<Double> iHinhHoc = new HinhVuong();
//        System.out.println(iHinhHoc.toString());
//
//        // test hinh vuong
//        HinhVuong hv1 = new HinhVuong(2.0);
//        HinhVuong hv2 = new HinhVuong();
//        hv2.setCanh(3.0);
//        System.out.println(hv1);
//        System.out.println(hv2);
//        System.out.println(hv1.tinhChuVi());
//        System.out.println(hv1.tinhDienTich());
//        // test hinh tron
//        HinhTron ht1 = new HinhTron(3.0);
//        HinhTron ht2 = new HinhTron();
//        ht2.setRadius(4.0);
//        System.out.println(ht1);
//        System.out.println(ht2);
//        System.out.println(ht1.tinhChuVi());
//        System.out.println(ht1.tinhDienTich());

    }
}
