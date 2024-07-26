package chapter3;

public class Driver extends People {
    private String licenseNumber;
    public Driver(String name, int age, String licenseNumber) throws Exception {
        super(name, age);
        this.licenseNumber = licenseNumber;
        // 제 1종 보통이나 제 2종 보통은 대한민국에서 18세 이상인 사람만이 취득이 가능합니다.
        // Driver 클래스의 인스턴스를 생성할 때는 해당 사용자가 18세 이상인지에 대한 여부를 확인해야 합니다.

        // chapter2에서 작성한 privatePeople 클래스에서 나이에 대한 정보를 담고 있는 age 멤버 변수와 getAge 함수는 private 이기 때문에 해당 클래스를 상속받아 작성한 클래스에서의 접근은 불가능합니다.
        // 이 경우 직접적인 age를 protected로 접근을 변경하여 위험성을 높이기 보단 나이 데이터를 반환하는 getAge 함수를 protected로 변경하여 People 클래스를 상속받는 클래스에서 해당 함수를 사용 가능하게 변경하였습니다.
        if (this.getAge() < 18){
            throw new Exception("운전면허를 취득할 수 없는 나이의 사용자입니다.");
        }
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }
}
