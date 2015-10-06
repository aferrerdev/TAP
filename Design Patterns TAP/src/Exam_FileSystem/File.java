package Exam_FileSystem;

import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 */
public class File implements AComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
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
        return "/"+this.name;
    }

    // Implement methods:
    @Override
    public List<String> collect() {
        return null;
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
        return null;
    }

    @Override
    public List<File> search() {
        return null;
    }
}
