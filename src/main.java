import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Human Gennadiy = new Human("Gennadiy", Gender.Male);
        Human Valentina = new Human("Valentina", Gender.Female);
        Human Igor = new Human("Igor", Gender.Male, Valentina, Gennadiy);
        Human Nina = new Human("Nina", Gender.Female, new Human("Alexandra", Gender.Female), new Human("Sergey", Gender.Male));
        Human Andrey = new Human("Andrey", Gender.Male, Nina, Igor);
        Andrey.addChildrenString("Sergey");
        Nina.addChildrenString("Andrey");
        Nina.addChildrenString("Tatyana");

//        System.out.println(Igor);
        System.out.println(Nina);
        System.out.println(Andrey);
//        System.out.println(Andrey.getMother().getName());



    }
}
