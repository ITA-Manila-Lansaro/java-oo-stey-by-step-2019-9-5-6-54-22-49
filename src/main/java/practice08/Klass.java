package practice08;

public class Klass {
    private int number;
    private String displayName = "Class ";
    private Student leader;

    public Klass(int klass) {
        this.number = klass;
    }

    public void assignLeader (Student student){
        this.leader = student;
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

    public Student getLeader() {
        return leader;
    }

}
