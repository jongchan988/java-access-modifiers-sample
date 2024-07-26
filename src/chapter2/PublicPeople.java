package chapter2;

public class PublicPeople {
    public String name;

    public int age;

    public int getAge(){
        return this.age;
    }
    public Boolean isAdult(){
        return getAge() >= 20;
    }


    public PublicPeople(String name, int age){
        this.name = name;
        this.age = age;
    }
}
