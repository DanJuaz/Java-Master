public class Wheel {
    private String maker;
    private int radio;
    private double width;

    public Wheel(String maker, int radio, int width){
        this.maker=maker;
        this.radio=radio;
        this.width=width;
    }

    public String getMaker() {
        return maker;
    }

    public int getRadio() {
        return radio;
    }

    public double getWidth() {
        return width;
    }
}
