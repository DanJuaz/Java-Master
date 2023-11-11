public class Tank {
    private int capacity;
    public Tank() {
        this.capacity = 40;
    }
    public Tank(int capacity) {
        this();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
