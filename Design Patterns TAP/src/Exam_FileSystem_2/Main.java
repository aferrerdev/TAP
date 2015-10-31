package Exam_FileSystem_2;
import Exam_FileSystem_2.AComponent;
import Exam_FileSystem_2.Directory;
import Exam_FileSystem_2.File;
import Exam_FileSystem_2.FileExistsException;

import java.util.Collections;
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
        try
        {
            home.addChild(a);
            home.addChild(a); //Test Error
            home.addChild(b);
            home.addChild(tmp);
            tmp.addChild(c);
        }
        catch (FileExistsException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Exercise 1: ls():");
        home.ls();

        System.out.println("\nExercise 2: collect():");
        List<String> list = home.collect();
        list.forEach(name -> System.out.println(name));

        System.out.println("\nExercise 3: toList():");
        List<AComponent> listA = home.toList();
        // 3. Use Comparator<T>, Collections.sort and Closures to order by name the list that is obtained by toList.
        Collections.sort(listA, (AComponent comp1, AComponent comp2) -> comp1.getName().compareTo(comp2.getName()));
        listA.forEach(component -> System.out.println(component.toString()));

        System.out.println("\nExercise 4: search():");
        List<File> list_search = home.search("a.txt");
        list_search.forEach(component -> System.out.println("Found "+list_search.size()+" file: "+component.toString()));
    }
}

