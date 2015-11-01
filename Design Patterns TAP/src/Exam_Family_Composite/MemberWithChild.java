package Exam_Family_Composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexferrerlopez on 1/11/15.
 * Family Member with children.
 */
public class MemberWithChild extends FamilyMember {
    private List<FamilyMember> children;

    public MemberWithChild(String name, int age) {
        super(name, age);
        children = new LinkedList<FamilyMember>();
    }

    public void addChild(FamilyMember child){
        children.add(child);
    }

    public void removeChild(FamilyMember child){
        children.remove(child);
    }

    @Override
    public String presentar() {
        String presentarse = this.toString()+"\n\t Els meus fills son:";
        for (FamilyMember child : children) {
            presentarse = presentarse + "\n\t\t"+child.presentar();
        }
        return presentarse;
    }

    // Número de descendents:
    @Override
    public int numberChild() {
        int numChildParent = 0;
        for(FamilyMember member: children){
            numChildParent = member.numberChild() + numChildParent;
            numChildParent++;
        }
        return numChildParent;
    }
}
