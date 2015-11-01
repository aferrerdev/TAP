package Exam_FileSystem_2;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class VisitorLs extends Visitor {

    @Override
    public void visit(File file) {
        System.out.println(file.toString());
    }

    @Override
    public void visit(Directory directory) {
        directory.getChildren().forEach((file -> file.ls()));
    }
}
