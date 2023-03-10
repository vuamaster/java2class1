package buoi1b.bai1;

public class Drawable {
    public <T extends IHinhHoc> void draw(T t){
        String tmp =String.format("ve hinh %s, co dien tich la %f, chu vi la %f ", t.getClass().getSimpleName(),t.tinhDienTich(), t.tinhChuVi());
        System.out.println(tmp);
    }
}
