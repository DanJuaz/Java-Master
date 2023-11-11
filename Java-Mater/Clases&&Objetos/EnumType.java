public enum EnumType {
    SEDAN("Sedan", "Compact", 4),
    SUV("SUV", "Mid-size", 5),
    COUPE("Coupe", "Sport", 2),
    HATCHBACK("Hatchback", "Subcompact", 4),
    CONVERTIBLE("Convertible", "Luxury", 2),
    MINIVAN("Minivan", "Family", 7),
    SPORTS("Sports car", "Performance", 2),
    ELECTRIC("Electric", "Compact", 5),
    LUXURY("Luxury car", "Full-size", 5),
    OFFROAD("Off-road vehicle", "Large", 5);
    private final String nombre;
    private final String description;
    private  final int doors;

    EnumType(String nombre, String description, int doors) {
        this.nombre = nombre;
        this.description = description;
        this.doors = doors;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }

    public int getDoors() {
        return doors;
    }

}
