package practice06;

public class Teacher {
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass) {
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

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        if (this.getKlass() > 0 ){
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach Class "+getKlass()+".";
        }
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach No Class.";
    }
}
