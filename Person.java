package StudentTeacher;

public class Person {
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // constractor 
    public Person(){
        name = "";
        age = 0;
    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void print () {
        System.out.println("Nama = " + name);
        System.out.println("Umur = " + age);
    }

}
