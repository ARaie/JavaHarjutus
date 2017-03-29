
public class Item {
    private String title;
    private boolean avability;
    private Type type;

    public Item(String title, Boolean avability, Type type) {
        this.title = title;
        this.avability = avability;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean isAvailable() {
        return avability;
    }

    public void setAvability(boolean avability) {
        this.avability = avability;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}