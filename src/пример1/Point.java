package пример1;

//пример1.Point flyweight
public class Point extends Square {
    @Override
    public void draw(int x, int y) {
        System.out.println("Рисуем точку по координатам "+x+","+y);
    }
}
