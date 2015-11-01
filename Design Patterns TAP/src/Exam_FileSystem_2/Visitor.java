package Exam_FileSystem_2;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public abstract class Visitor
{
    // Metodes abtractes Visit per als Files.
    public abstract void visit(File file);
    // Metode visit per als directoris.
    public abstract void visit(Directory directory);
}
