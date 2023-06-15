package HW_5;

import HW_5.controller.StudentController;
import HW_5.controller.TeacherController;
import HW_5.repository.StudentRepository;
import HW_5.repository.TeacherRepository;
import HW_5.service.StudentService;
import HW_5.service.StudyGroupService;
import HW_5.service.TeacherService;
import HW_5.view.SortType;
import HW_5.view.StudentView;
import HW_5.view.StudyGroupView;
import HW_5.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Сергей Сергеев", 20, "122-32442", "св");
        view.create("Иван Иванов", 18, "122-55244", "тсс");
        view.create("Дмитрий Дмитриев", 22, "122-35552", "гс");
        view.create("Василий Васильев", 17, "122-9878", "ик");
        view.create("Федор Федоров", 23, "122-53234", "гс");
        view.create("Илья Ильин", 21, "122-54355", "св");
        view.create("Светлана Светикова", 20, "122-75559", "тсс");
        view.create("Варвара Варина", 19, "122-354249", "ик");

        System.out.println("\n---- Учащиеся ----\n");
        view.sendOnConsole(SortType.NONE);

        System.out.println("\n---- Преподаватели ----\n");

        TeacherView view1 = getTeacherView();
        view1.create("Андрей Михайлович Сергеев", 36, "122-1568", "св");
        view1.create("Сергей Евгеньевич Петров", 39, "122-14594", "тсс");
        view1.create("Светлана Владимировна Иванова", 45, "122-21436", "гс");
        view1.create("Анна Дмитриевна Григорьева", 44, "122-45421", "ик");
        view1.create("Петр Геннадьевич Дмитриев", 55, "122-45787", "св");

        view1.sendOnConsole(SortType.NONE);
        StudyGroupView studyGroupView = new StudyGroupView();

        view1.viewTeacher(view1.getById(4));   // определение студента и преподавателя по ID (и вывод через вьюшку)
        view.viewStudent(view.getById(3));
        view.viewStudent(view.getById(9));


        String nameGr = studyGroupView.getValue("\nВведите группу: ");
        StudyGroupService studService = new StudyGroupService(view1.getAll(), view.getAll());
        view1.viewGroupTeachers(studService.createTeacherGroup(nameGr));
        view.viewGroupStudents(studService.createStudentGroup(nameGr));
    }


    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    public static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}