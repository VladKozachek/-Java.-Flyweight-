package пример2;

public class Main {
    public static void main(String[] args) {
        FlyWeightGarage flyWeightGarage=new FlyWeightGarage();
        Audi audi1=flyWeightGarage.getAudi("Белый");  //создается новый обьект
        Audi audi2=flyWeightGarage.getAudi("Красный");//создается новый обьект
        Audi audi3=flyWeightGarage.getAudi("Белый");//используется уже созданый

    }
}
