package buoi1b.bai1;

public class HinhVuong implements IHinhHoc<Double>{
    private double canh =1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh<=0){
            throw  new RuntimeException("Error");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh<=0){
            throw  new RuntimeException("Error");
        }
        this.canh = canh;
    }

    @Override
    public Double tinhChuVi() {
        return canh*4;
    }

    @Override
    public Double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" +
                "canh=" + canh +
                ']';
    }
}
