package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class VisitorCollect extends Visitor {
    List<String> result;

    public VisitorCollect() {
        result = new LinkedList<String>();
    }

    @Override
    public void visit(File file) {
        result.add(file.toString());
    }

    @Override
    public void visit(Directory directory) {
        result.add(directory.toString());
        for (AComponent child : directory.getChildren())
            child.accept(this);
    }


    public List<String> getResult() {
        return result;
    }
}
