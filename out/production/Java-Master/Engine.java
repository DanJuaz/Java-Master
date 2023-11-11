public class Engine {
    private  double speed;
    private EnumTypeEngine type;
    public Engine() {
    this.speed=50.00d;
    }

    public Engine(double speed, EnumTypeEngine type) {
        this.speed = speed;
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDisplacement(double speed) {
        this.speed = speed;
    }

    public EnumTypeEngine getType() {
        return type;
    }

    public void setType(EnumTypeEngine type) {
        this.type = type;
    }
}
