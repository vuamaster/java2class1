package buoi1b.bai3;

public class HinhVuong implements MyComparator<HinhVuong>{
    private double canh = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }
    public double chuvi(double canh){
        return canh*4;
    }
    public double dientich(double canh){
        return canh*canh;
    }

    @Override
    public int compare(HinhVuong o) {
        if (this.canh>o.canh){
            return 1;
        } else if(this.canh < o.canh){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
