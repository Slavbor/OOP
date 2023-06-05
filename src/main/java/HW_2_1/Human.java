package HW_2_1;

public class Human extends Actor {

    private int age;
    private String address;

    public Human(String name, int age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }

    public String orderStatus() {
        if (isTakeOrder) {
            return "Заказ получен";
        }
        if (isMakeOrder) {
            return "Заказ уже существует";
        }
        return "Такого заказа нет!";
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s возраст %s адрес: %s%n%s"
                , name, age, address, orderStatus());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}