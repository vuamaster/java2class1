package buoi1b.bai1;

public class HinhTron implements IHinhHoc<Double>{
    private double radius = 1.0;

    public HinhTron() {
    }

    public HinhTron(double radius) {
        if (radius<= 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<= 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    @Override
    public Double tinhChuVi() {
        return radius*2*Math.PI;
    }

    @Override
    public Double tinhDienTich() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "radius=" + radius +
                ']';
    }
}
