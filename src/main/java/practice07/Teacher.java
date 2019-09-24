package practice07;

public class Teacher extends Klass {
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null){
            return "My name is Tom. I am "+getAge()+" years old. I am a Teacher. I teach No Class.";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + klass.getDisplayName()+".";
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() != this.getKlass().getNumber()){
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
    }
}
