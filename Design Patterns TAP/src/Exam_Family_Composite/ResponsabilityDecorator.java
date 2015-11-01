package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class ResponsabilityDecorator extends MemberWithChild {

    protected MemberWithChild membreFamilia;

    public ResponsabilityDecorator (MemberWithChild member) {
        super(member.getName(), member.getAge());
        this.membreFamilia=member;
    }

    @Override
    public int numberChild() {
        return membreFamilia.numberChild();
    }

    @Override
    public String presentar() {
        return membreFamilia.presentar();
    }
}
