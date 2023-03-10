package buoi1a.vd1;

public class MyDictionary<K,V> {
    //key viet tat la k
    // value la v
    private K k;
    private V v;

    public MyDictionary() {
    }

    public MyDictionary(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "[key  = "+ k+ ", value = " + v +"]";
    }
}
