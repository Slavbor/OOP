package HW_4;

import HW_4.controller.StudentController;
import HW_4.controller.TeacherController;
import HW_4.repository.StudentRepository;
import HW_4.repository.TeacherRepository;
import HW_4.service.StudentService;
import HW_4.service.TeacherService;
import HW_4.view.SortType;
import HW_4.view.StudentView;
import HW_4.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();

        studentView.create("Сергей Сергеев", 20, "122-3244");
        studentView.create("Иван Иванов", 21, "122-552");
        studentView.create("Иван Иванов", 21, "122-552");
        studentView.create("Дмитрий Дмитриев", 22, "122-3555");
        studentView.create("Василий Васильев", 20, "122-9878");
        studentView.create("Федор Федоров", 20, "122-5323");

        studentView.sendOnConsole(SortType.AGE);

        teacherView.create("Лара Зайцева", 35, "123-3244");
        teacherView.create("Светлана Иванова", 36, "123-2144");
        teacherView.create("Фекла Петрова", 37, "123-5425");
        teacherView.create("Василий Теркин", 38, "123-3522");
        teacherView.create("Василиса Лубяная", 39, "123-7878");
        teacherView.create("Александр Свистоплясов", 40, "123-3564");
        teacherView.sendOnConsole(SortType.ID);

        teacherView.edit("Василий Теркин", 38, "123-3522");
        teacherView.sendOnConsole(SortType.ID);

        studentView.edit("Иван Иванов", 21, "122-552");
        studentView.edit("Иван Иванов", 21, "122-552");
        studentView.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}