package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class NetejarDecorator extends ResponsabilityDecorator {

    public NetejarDecorator(MemberWithChild member) {
        super(member);
    }
    public String presentar(){
        return membreFamilia.presentar()+" "+"\n Jo me'n encarrego de netejar.";
    }
}
