package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 */
public class File implements AComponent {
    private String name;
    private int size;
    private AComponent parent = null;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        String path = parent.toString()+ "/";
        return path + name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    // Implement methods:
    @Override
    public List<String> collect() {
        List<String> result = new LinkedList<String>();
        result.add(toString());
        return result;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void ls() {
        System.out.println(this.toString());
    }

    @Override
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);
        return result;
    }

    @Override
    public List<File> search(String name) {
        List<File> result = new LinkedList<File>();
        if (this.name.equals(name))
            result.add(this);
        return result;
    }

    @Override
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
