package practice10;

import java.util.LinkedList;

public class Teacher extends Klass {
    private String name;
    private int age;
    private Klass klass;
    private int id;
    private LinkedList<Klass> linkedList;
    private boolean isTeaching;

    public Teacher(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Teacher(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.linkedList = linkedList;
    }

    public boolean isTeaching(Klass klass) {
        for (Klass linkedKlass : linkedList){
            if (linkedKlass.getKlass().getNumber() == klass.getKlass().getNumber() ){
                this.isTeaching = true;
                break;
            }else
            {
                this.isTeaching = false;
                break;
            }
        }
        if (linkedList.size() < 2){
            if (linkedList.getFirst().getKlass().getNumber() == klass.getNumber()){
                isTeaching = true;
            }
            else
            {
                isTeaching = false;
            }
        }
        return isTeaching;
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

    public LinkedList<Klass> getClasses(){
        return linkedList;
    }

    public String introduce() {
        StringBuilder stringBuilder = new StringBuilder();
        if (klass == null && linkedList == null){

            stringBuilder.append("My name is Tom. I am "+getAge()+" years old. I am a Teacher. I teach No Class.");

        }else{
            stringBuilder.append("My name is "+getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class ");
            stringBuilder.append(linkedList.getFirst().getKlass().getNumber()+", ");
            stringBuilder.append(linkedList.getLast().getKlass().getNumber()+".");
        }
                return stringBuilder.toString();
    }

    public String introduceWith(Student student){
        try{
            if (student.getKlass().getNumber() == this.linkedList.getFirst().getKlass().getNumber()) {
                return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
            }
        }catch (Exception e){

        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";

    }

}
