import java.util.List;

public class Mother extends Human{
List<Human> children;


    public Mother(String name, Gender gender) {
        super(name, gender);
    }

    public Mother(String name, Gender gender, Human mother, Human father) {
        super(name, gender, mother, father);
    }

    @Override
    public String toString() {


        return "name: " + name;
    }
}
