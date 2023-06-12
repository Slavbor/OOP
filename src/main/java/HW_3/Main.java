package HW_3;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("\nСписок без сортировки:");
        controller.addStudent(new Student(4L, "Иван Иванов"));
        controller.addStudent(new Student(6L, "Петр Петров"));
        controller.addStudent(new Student(2L, "Сергей Сергеев"));
        controller.addStudent(new Student(1L, "Терентий Попов"));
        controller.addStudent(new Student(8L, "Евлампия Субботина"));
        controller.printAll();

        System.out.println("\nСортировка по имени:");
        controller.sortByFirstName();
        controller.printAll();

        System.out.println("\nСортировка по фамилии:");
        controller.sortByLastName();
        controller.printAll();

    }
}