package practice10;

import java.io.IOException;

public class Klass {

    private int number;
    private String displayName = "Class ";
    private Student leader;
    private Student member;

    public Klass(int klass) {
        this.number = klass;
    }

    public void assignLeader (Student student) throws IOException {
        if (member != null){
            this.leader = student;}
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student member){
        this.member = member;
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
