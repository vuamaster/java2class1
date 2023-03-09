package buoi1b.bai2;

public class SoPhuc {
    private double phanthuc = 1.0;
    private double phanao = 1.0;

    public SoPhuc() {
    }

    public SoPhuc(double phanthuc, double phanao) {
        this.phanthuc = phanthuc;
        this.phanao = phanao;
    }

    public double getPhanthuc() {
        return phanthuc;
    }

    public void setPhanthuc(double phanthuc) {
        this.phanthuc = phanthuc;
    }

    public double getPhanao() {
        return phanao;
    }

    public void setPhanao(double phanao) {
        this.phanao = phanao;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2f*i",phanthuc,phanao);
    }
    public SoPhuc cong(SoPhuc a){
        double thuc = phanthuc+a.phanthuc;
        double ao = phanao+a.phanao;
        return new SoPhuc(thuc, ao);
    }
    public  SoPhuc tru(SoPhuc a){
        double thuc = phanthuc - a.phanthuc;
        double ao = phanao - a.phanao;
        return new SoPhuc(thuc, ao);
    }
    public SoPhuc nhan(SoPhuc a){
        double thuc = phanthuc*a.phanthuc -  phanao*a.phanao;
        double ao = phanthuc*a.phanao + phanao*a.phanthuc;
        return new SoPhuc(thuc, ao);
    }
    public SoPhuc chia(SoPhuc a){
        double thuc = (phanthuc*a.phanthuc + phanao*a.phanao)/(a.phanthuc*a.phanthuc + a.phanao*a.phanao);
        double ao = (a.phanthuc*phanao - phanthuc*a.phanao)/(a.phanthuc*a.phanthuc + a.phanao*a.phanao);
        return new SoPhuc(thuc, ao);
    }
}
