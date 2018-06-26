package пример2;


import java.util.HashMap;
import java.util.Map;

public class FlyWeightGarage {
    private Map<String,Audi> map=new HashMap<>();
    Audi getAudi(String color){
        Audi audi= map.get(color);
        if(audi==null){
            audi=new Audi();
            audi.color=color;
            map.put(color,audi);
            System.out.println("Создали ауди "+color+" цвет");
        }
        return audi;
    }
}
