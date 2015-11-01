package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class ComprarDecorator extends ResponsabilityDecorator
{
    public ComprarDecorator(MemberWithChild membreFamilia) {
        super(membreFamilia);
    }
    @Override
    public String presentar() {
        return membreFamilia.presentar()+" "+"\n Jo mencarrego d'anar a comprar";
    }
}
