package practice07;

public class Student extends Klass{
    private String name;
    private int age;
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        this.klass = klass;
        this.name = name;
        this.age = age;
    }

    @Override
    public Klass getKlass() {
        return klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at "+klass.getKlass().getDisplayName()+".";
    }
}
