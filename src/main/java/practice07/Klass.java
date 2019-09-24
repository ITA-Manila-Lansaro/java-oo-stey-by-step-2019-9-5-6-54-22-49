package practice07;

public class Klass {
    private int number;
    private String displayName = "Class ";

    public Klass(int klass) {
        this.number = klass;
    }

    public Klass() {
    }

    public Klass getKlass() {
        return this;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName + number;
    }

}
