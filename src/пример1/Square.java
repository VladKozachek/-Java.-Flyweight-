package пример1;

//пример1.Square flyweight
public class Square implements Shape {
    int a=10;
    @Override
    public void draw(int x, int y) {
        System.out.println("Рисуем квадрат cо сторонами "+a+" по координатам "+x+","+y);
    }
}
