package bai2_6;

public class MyPoint {
    private int x = 0;
    private int y =0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[] {x, y};
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "MyPoint(" + x +
                "," + y +
                ')';
    }
    public double distance(int a,int b){
        double distance = Math.sqrt(Math.pow((a-x),2) + Math.pow((b-y),2));
        return distance;
    }
    public double distance(MyPoint another){
        double distance = Math.sqrt(Math.pow((another.x -x),2)+Math.pow((another.y-y),2));
        return distance;
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
}
