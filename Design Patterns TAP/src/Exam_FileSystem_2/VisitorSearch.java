package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class VisitorSearch extends Visitor{
    List<File> result;
    String name;

    public VisitorSearch(String name){
        result = new LinkedList<File>();
        this.name = name;
    }
    @Override
    public void visit(File file) {
        if (file.getName().equals(name))
            result.add(file);
    }
    @Override
    public void visit(Directory directory) {
        for(AComponent component: directory.getChildren())
        {
            result.addAll(component.search(name));
        }
        //children.forEach(file -> result.addAll(file.search(name)));
    }
    public List<File> getResult() {
        return result;
    }
}
