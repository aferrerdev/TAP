package Exam_Family_Composite;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class Main
{
    public static void main(String[] args)
    {
        MemberWithChild Jay = new MemberWithChild("Jay",67);
        // Jay children:
        MemberWithChild Claire = new MemberWithChild("Claire",43);
        MemberWithChild Mitchell = new MemberWithChild("Mitchell",37);
        MemberAlone Manny = new MemberAlone("Manny",15);
        MemberAlone Joe = new MemberAlone("Joe",1);
        Jay.addChild(Claire); Jay.addChild(Manny); Jay.addChild(Mitchell); Jay.addChild(Joe);
        // Claire children:
        MemberAlone Haley = new MemberAlone("Haley",22);
        MemberAlone Alex = new MemberAlone("Alex",15);
        MemberAlone Luke = new MemberAlone("Luke",14);
        Claire.addChild(Haley); Claire.addChild(Alex); Claire.addChild(Luke);
        // Mitchell children:
        MemberAlone Lily = new MemberAlone("Lily",6);
        Mitchell.addChild(Lily);

        // Test nombre de descendents d'un membre de la familia.
        System.out.println("Jay té "+Jay.numberChild()+" descendents.");
        System.out.println("Claire té "+Claire.numberChild()+" descendents.");
        System.out.println("Mitchell té "+Mitchell.numberChild()+" descendents.");

        // Presentar Membres Familia.
        System.out.println(Jay.presentar());

        // Part 2 Decoator
        System.out.println("PART DECORATOR:");
        Jay = new MemberWithChild("Jay",67);
        Jay.addChild(Lily);
        Jay = new ComprarDecorator(Jay);
        Jay = new NetejarDecorator(Jay);
        System.out.println(Jay.presentar());
    }
}
