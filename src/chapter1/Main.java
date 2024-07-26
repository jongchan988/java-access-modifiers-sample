package chapter1;

// chapter 1 public
public class Main {
    public static void main(String[] args) {
        // 홍길동이라는 사람을 생성합니다.
        People people = new People("홍길동");

        // 생성한 사람의 이름을 출력합니다.
        System.out.println(people.name);
    }
}
