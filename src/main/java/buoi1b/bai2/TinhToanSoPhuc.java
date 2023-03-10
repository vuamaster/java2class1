package buoi1b.bai2;

public class TinhToanSoPhuc implements ITinhToan<SoPhuc>{
    @Override
    public SoPhuc cong(SoPhuc... args) {
        SoPhuc t = new SoPhuc();
        for (SoPhuc s:args) {
            t= t.cong(s);
        }
        return t;
    }

    @Override
    public SoPhuc tru(SoPhuc t1, SoPhuc t2) {
        return t1.tru(t2);
    }

    @Override
    public SoPhuc nhan(SoPhuc... args) {
        SoPhuc t =new SoPhuc();
        for (SoPhuc s: args) {
            t = t.nhan(s);
        }
        return t;
    }

    @Override
    public SoPhuc chia(SoPhuc t1, SoPhuc t2) {
        return t1.chia(t2);
    }
}
