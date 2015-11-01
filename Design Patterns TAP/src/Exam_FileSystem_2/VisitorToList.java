package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class VisitorToList extends Visitor
{
    List<AComponent> result;

    public VisitorToList() {
        result = new LinkedList<AComponent>();
    }

    @Override
    public void visit(File file) {
        result.add(file);
    }

    @Override
    public void visit(Directory directory) {
        result.add(directory);
        for(AComponent element: directory.getChildren()){
            element.accept(this);
        }
    }

    public List<AComponent> getResult() {
        return result;
    }
}
