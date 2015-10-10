package Exam_FileSystem;

/**
 * Created by Alex on 10/10/2015.
 */
public class FileExistsException extends Exception {
    public FileExistsException(){
        super("File already exists!");
    }
}
