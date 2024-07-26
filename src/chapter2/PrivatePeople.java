package chapter2;

public class PrivatePeople {
    private String name;

    private int age;

    public PrivatePeople(String name, int age){
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

    private int getAge(){
        return this.age;
    }

    public Boolean isAdult(){
        return getAge() >= 20;
    }
}
