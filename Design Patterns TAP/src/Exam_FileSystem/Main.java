package Exam_FileSystem;

import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 */
public class Main {
    // FILESYSTEM Main
    public static void main(String[] args) {

        Directory home = new Directory("home");
        File a = new File("a.txt",2);
        File b = new File("b.txt",3);
        Directory tmp = new Directory("tmp");

        // Afegim fills al directory pare home
        home.addChild(a);
        home.addChild(b);
        home.addChild(tmp);

        home.ls();


    }
}
