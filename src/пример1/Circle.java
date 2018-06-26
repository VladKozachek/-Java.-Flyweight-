package пример1;

//пример1.Circle flyweight
public class Circle implements Shape{
    int r=5;
    @Override
    public void draw(int x, int y) {
        System.out.println("Рисуем круг радиусом "+r+" по координатам "+x+","+y);
    }
}
