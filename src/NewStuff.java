public class NewStuff {
    int j;
    int k;
    int v;

    NewStuff (int j, int k, int v){}

    public void setJ(int j) {
        this.j = j;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }

    public int getV() {
        return v;
    }

    public int getGgg() {
        return ggg;
    }

    public void setGgg(int ggg) {
        this.ggg = ggg;
    }

    int ggg;

    @Override
    public String toString() {
        return "NewStuff{" +
                "j=" + j +
                ", k=" + k +
                ", v=" + v +
                ", ggg=" + ggg +
                '}';
    }
}
