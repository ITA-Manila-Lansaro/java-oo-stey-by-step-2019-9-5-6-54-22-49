package practice08;

public class Student extends Klass {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
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
        if (klass.getLeader() != null){
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at "+klass.getKlass().getDisplayName()+".";
    }
}
