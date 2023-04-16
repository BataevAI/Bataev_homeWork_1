import java.util.ArrayList;
import java.util.List;

public class Human {

    String name;
    Gender gender;


    private Human mother;
    private Human father;
    private List<String> children;
    private List<Human> humanList;

    public ArrayList<String> addChildrenString(String name) {
        children = new ArrayList<>();
        children.add(name);
        return (ArrayList<String>) children;

    }


    public Human(String name, Gender gender, Human mother, Human father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.gender = gender;
        this.children = null;


    }

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

    }

    public Human(String name, Gender gender, Human mother, Human father, List<String> children) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.children = children;


    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setMother() {
        this.mother = mother;
    }

    public Gender getGender() {
        return gender;
    }


    public void setFather(Human father) {
        this.father = father;
    }


    public String getName() {
        return name;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }


    public List<String> getChildren() {
        return children;
    }

    public String getChildrenName(List<String> lst) {
        for (String child : lst) {
            return child;
        }
        return null;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }


    public void addHuman(Human human) {

        humanList.add(human);

    }

    public Human getHumanByName(String name) {

        for (Human human : humanList) {

            if (human.getName().equals(name)) {

                return human;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (mother == null) {

            return "name: " + name;
        }
        if (children == null) {

            return "name: " + name + ", sex: " + gender + ", mother: " + mother + ", father: " + father;

        } else
            return "name: " + name + ", sex: " + gender + ", mother: " + mother + ", father: " + father + ", children: " + getChildrenName(getChildren());

    }


}
