package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public abstract class FamilyMember
{
    public abstract int numberChild();
    public abstract String presentar();

    String name;
    int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Em dic "+name+" i tinc "+age+" anys.";
    }
}