package chapter2;

// chapter 2 private
// private의 필요성을 보여주기 위하여 기존 public 코드에서 private 부분을 추가하여 작성함
public class Main {
    public static void main(String[] args) {

        // public 일 경우 chapter1과 동일합니다. 하지만 이번 쳅터에서는 public 속성을 사용하여 외부에서 이름을 변경하여 실수를 유발합니다.
        // 먼저 공개하지 않아도 되는 내용의 접근도 가능할 뿐 아니라 개발자의 실수로 인하여 데이터의 손상이 발생할 가능성도 높습니다.

        // 공통된 목적은 다음과 같습니다.
        // 1. 이름을 출력합니다.
        // 2. 사람이 성인 인지의 여부를 확인합니다.
        // 비교를 위하여 PublicPeople, PrivatePeople Class 를 생성합니다.

        PublicPeople publicPeople = new PublicPeople("홍길동", 20);
        PrivatePeople privatePeople = new PrivatePeople("아무개", 20);

        echoName(publicPeople, privatePeople);
        echoIsAdult(publicPeople, privatePeople);
    }

    // public으로 정의를 했을 경우 해당 함수를 구현 하는 사람의 실수로 name을 수정할 가능성이 존재합니다.
    // 해당 함수에서는 이런식으로 맴버변수에 직접적으로 접근해서 데이터를 수정했을때 발생할 수 있는 문제에 대하여 다룹니다.
    public static void echoName(PublicPeople publicPeople, PrivatePeople privatePeople){

        // 실수로 수정한 사람의 이름
        publicPeople.name = "실수로 입력한 값";
        // privatePeople.name은 직접적인 접근이 가능하지 않습니다.

        // 출력 부분
        System.out.println("publicPeople.name: "+ publicPeople.name);
        System.out.println("privatePeople.name: "+ privatePeople.getName());
        // publicPeople.name: 실수로 입력한 값
        // privatePeople.name: 홍길동

    }

    // 해당 함수의 목적은 사람이 어른인지 아닌지에 대한 여부를 출력하는 함수입니다.
    //
    // 클래스의 인스턴스에는 공개하고 싶지 않은 정보가 존재할 수 있습니다.(암호화를 하기 위한 키값)
    // 이와 같은 민감한 정보들은 대부분 외부에서 접근이 불가능한 private 로 정의합니다.
    //
    // 나이를 뜻하는 age 맴버변수와 해당 데이터의 값을 반환하는 getAge 함수를 private으로 하지 않을 경우 발생할 수 있는 문제에 대하여 다룹니다.
    //
    public static void echoIsAdult(PublicPeople publicPeople, PrivatePeople privatePeople){
        // echoName과 마찬가지로 publicPeople의 경우 age에 대한 정보 수정이 가능합니다.
        // 일반적으로 나이는 변경이 불가능한 정보지만 public 접근으로 인하여 해당 정보가 변경됩니다.
        publicPeople.age = 4;

        // 개인정보인 나이는 공개하고 싶지 않은 데이터일 수 있습니다.
        // privatePeople의 경우 나이가 몆 살인지에 대한 정보는 알 수 없습니다.
        System.out.println("publicPeople.age: "+ publicPeople.getAge());
        // System.out.println("privatePeople.name: "+ privatePeople.getAge());


        // 해당 함수의 목적은 사람이 어른인지 아닌지에 대한 여부를 확인하는 부분입니다.
        // privatePeople이 대부분의 접근이 제어되어 정상적인 기능을 못할 거라 생각하지만
        // 상대적으로 안전하게 작성이 가능할 뿐 아니라 목적에 대한 기능은 전부 지장 없이 구현이 가능합니다.
        if (privatePeople.isAdult()) {
            System.out.println("privatePeople은 어른입니다.");
        } else {
            System.out.println("privatePeople은 어른이 아닙니다.");
        }

        if (publicPeople.isAdult()) {
            System.out.println("publicPeople은 어른입니다.");
        } else {
            System.out.println("publicPeople은 어른이 아닙니다.");
        }
    }
}
