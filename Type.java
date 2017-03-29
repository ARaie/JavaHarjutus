

public enum Type {
    NEW_RELEASES("(New Releases)"),
    REGULAR("(Regular rental)"),
    OLD("(Old film)");

    private final String type;

    private Type(String type) {
        this.type = type;
    }

    public static Type getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }



    public String toString() {
        return type;
    }
}