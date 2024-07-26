package chapter3;

public class People {
    private String name;

    private int age;

    public People(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name){
        this.name = name;
    }

    private void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    // private -> protected
    protected int getAge(){
        return this.age;
    }

    public Boolean isAdult(){
        return getAge() >= 20;
    }
}
