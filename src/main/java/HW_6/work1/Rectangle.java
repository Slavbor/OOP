package HW_6.work1;


// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

abstract class AbstractFigure {
    int width;
    public String getType() {
        return "Геометрическая фигура";
    }
}

interface Heigth {
    int setSquare();
}

class Rectangle extends AbstractFigure implements Heigth {
    int heigth;
    public String getType() {
        return "Прямоугольник";
    }
    public void setWidth(int width) { this.width = width; }
    public void setHeigth(int heigth) { this.heigth = heigth; }
    @Override
    public int setSquare() { return width*heigth; }
}

class Square extends AbstractFigure {
    public String getType() {
        return "Квадрат";
    }
    public void setWidth(int width) { this.width = width; }
    public int setSquare() { return width*width; }

}