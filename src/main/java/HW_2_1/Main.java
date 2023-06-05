package HW_2_1;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Ivan", 20, "St.Petersburg");

        System.out.println(human1);
        human1.setMakeOrder();
        System.out.println(human1);
        human1.setTakeOrder();
        System.out.println(human1);

    }
}