public enum EnumColor {
    RED("Red"),
    YELLOW("Yellow"),
    ORANGE("Orange"),
    GREY("Grey"),
    WHITE("White"),
    BLACK("Black");

    private final String color;

    EnumColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
