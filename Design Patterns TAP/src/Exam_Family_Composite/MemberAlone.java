package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 * Family Member withouth child.
 */
public class MemberAlone extends FamilyMember
{
    public MemberAlone(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String presentar() {
        return this.toString();
    }

    @Override
    public int numberChild() {
        return 0;
    }
}
