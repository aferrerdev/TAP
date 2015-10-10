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
        File c = new File("c.txt",10);

        // Afegim fills al directory pare home
        home.addChild(a);
        home.addChild(b);
        home.addChild(tmp);
        tmp.addChild(c);

        System.out.println("Exercise 1: ls():");
        home.ls();

        System.out.println("\nExercise 2: collect():");
        List<String> list = home.collect();
        list.forEach(name -> System.out.println(name));

        System.out.println("\nExercise 3: toList():");
        List<AComponent> listA = home.toList();
        listA.forEach(component -> System.out.println(component.toString()));

        System.out.println("\nExercise 4: search():");
        List<File> list_search = home.search("a.txt");
        list_search.forEach(component -> System.out.println("Found "+list_search.size()+" file: "+component.toString()));
    }
}
