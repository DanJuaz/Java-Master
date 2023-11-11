public class Coche implements  Comparable<Coche>{
    private  int id;
    private static int lastId;
    private String maker;
    private String model;
    private Engine engine;
    private Tank tank;
    private Person driver;
    private Wheel[] wheels;
    private int wheelsIndex;

    private EnumType tipo= EnumType.MINIVAN;

    private EnumColor color= EnumColor.GREY;
    private static EnumColor plateColor= EnumColor.WHITE;

    public final static Integer MAX_SPEED=200;
    public final static int MAX_SPEED_CITY=90;
    /*
    public final static String COLOR_GREEN="Green";
    public final static String COLOR_GREY="Grey";
    public final static String COLOR_RED="Red";
    public final static String COLOR_WHITE="White";
    public final static String COLOR_BLUE="Blue";
    */

    //CONSTRUCTORS
    public Coche(){
        this.id = ++lastId;
        this.wheels=new Wheel[5];
    }
    public Coche(String maker, String model){
        this();
        this.maker=maker;
        this.model=model;
    }

    public Coche(String maker, String model, EnumColor color) {
        this(maker, model);
        this.color = color;
    }

    public Coche(String maker, String model, EnumColor color, Engine engine) {
        this(maker, model, color);
        this.engine=engine;
    }

    public Coche(String maker, String model, EnumColor color, Engine engine, Tank tank) {
        this(maker, model, color, engine);
        this.tank=tank;
    }
    public Coche(String maker, String model, EnumColor color, Engine engine, Tank tank, EnumType tipo) {
        this(maker, model, color, engine, tank);
        this.tipo = tipo;
    }

    public Coche(String maker, String model, EnumColor color, Engine engine, Tank tank, EnumType tipo, Person driver) {
        this(maker, model, color, engine, tank, tipo);
        this.driver=driver;
    }

    public Coche(String maker, String model, EnumColor color, Engine engine, Tank tank, EnumType tipo, Person driver, Wheel[] wheels) {
        this(maker, model, color, engine, tank, tipo, driver);
        this.wheels=wheels;
    }
    //GETTER AND SETTER


    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public EnumType getTipo() {
        return tipo;
    }

    public void setTipo(EnumType tipo) {
        this.tipo = tipo;
    }

    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public static EnumColor getPlateColor() {
        return plateColor;
    }

    public static void setPlateColor(EnumColor plateColor) {
        Coche.plateColor = plateColor;
    }
    public Coche addWheel(Wheel wheels){
        if(wheelsIndex<this.wheels.length) {
            this.wheels[wheelsIndex++] = wheels;
        }
        return this;
    }

    //METHOD
    public String speedUp(int rpm){
        return this.maker+"acelerando a"+rpm+"rmp";
    }
    public String slowDown(){
        return this.maker+" "+this.model+"frenando!!";
    }
    public String speedUpSlowDown(int rpm){
        String speedUp = this.speedUp(rpm);
        String slowDown = this.slowDown();
        return speedUp+"\n"+slowDown;
    }
    public float calculateConsumption(int km, float porcentGasoline){
        return km/(this.getTank().getCapacity()*porcentGasoline);
    }
    public float calculateConsumption(int km, int porcentGasoline){
        return km/(this.getTank().getCapacity()*(porcentGasoline/100f));
    }
    //Sobre escribir metodos de clase Padre Object
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Coche)){
            return false;
        }
        Coche coche = (Coche) obj;
        return (this.maker.equals(coche.getMaker()) && this.model.equals(coche.getModel()));
    }
    // SObrescribir la clase Padre String
    @Override
    public String toString() {
        return "Coche{" +
                "id='"+this.id+'\''+
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color.getColor() + '\'' +
                ", velocity=" + engine.getSpeed() +
                ", pondCapacity=" + tank.getCapacity() +
                ", tipo= "+tipo.getNombre()+
                ", Plate Color="+Coche.plateColor+
                '}';
    }

    @Override
    public int compareTo(Coche coche) {
        return this.maker.compareTo(coche.maker);
    }

}
