package practice05;

public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Worker. I have a job.";
    }
}
