package practice11;

import java.io.IOException;

public class Klass {
    private int number;
    private String displayName = "Class ";
    private Student leader;
    private Student member;
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(int klass) {
        this.number = klass;
    }

    public void assignLeader (Student student) throws IOException {
        if (member != null){
            this.leader = student;
            System.out.print("I am Tom. I know "+student.getName()+" become Leader of Class "+this.getNumber()+".\n");
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student member){
        this.member = member;
        System.out.print("I am Tom. I know "+member.getName()+" has joined Class "+this.getNumber()+".\n");
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
