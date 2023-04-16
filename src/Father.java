public class Father extends Human{


    public Father(String name, Gender gender) {
        super(name, gender);
    }

    public Father(String name, Gender gender, Human mother, Human father) {
        super(name, gender, mother, father);
    }

    @Override
    public String toString() {

//        return "name: " + name + ", sex: " + gender + ", mother: " + getMother() + ", father: " + getFather() + ", children: " + getChildren();
        return "name: " + name;
    }
}
