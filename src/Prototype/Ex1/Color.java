package Prototype.Ex1;

public class Color implements Cloneable{

    protected int r;
    protected int g;
    protected int b;

    public Color(int r, int g, int b) {

        this.r = r;
        this.g = g;
        this.b = b;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Color clone(){

        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String toString() {
        return "couleur defini par r: " + r + " g: " + g + " b :" + b;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }
}
