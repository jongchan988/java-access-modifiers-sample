package chapter3;

// chapter 3 protected
// 해당 챕터에서는 protected가 필요한 이유에 대하여 다룹니다.
public class Main {
    public static void main(String[] args) throws Exception {

        // 정상적인 driver인 경우
        Driver driver1 = new Driver("홍길동", 19, "1234-4444");
        System.out.println("driver1.licenseNumber: " +driver1.getLicenseNumber());

        // throw Exception "운전면허를 취득할 수 없는 나이의 사용자입니다."
        Driver driver2 = new Driver("아무개", 16, "1234-4444");
        System.out.println("driver2.licenseNumber: " +driver2.getLicenseNumber());
    }
}
