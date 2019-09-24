package practice11;

public class Person extends Klass{
    private String name;
    private int age;
    private int id;

    public Person(int number, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = number;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }

    @Override
    public boolean equals(Object obj)
    {

        // if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Person by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Person)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        Person person = (Person) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (person.name.equals(this.name)  && person.id == this.id);
    }

    @Override
    public int hashCode(){
        return id;
    }
}
