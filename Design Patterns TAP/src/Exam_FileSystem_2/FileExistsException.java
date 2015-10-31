package Exam_FileSystem_2;

/**
 * Created by Alex on 10/10/2015.
 */
public class FileExistsException extends Exception {
    public FileExistsException(){
        super("File already exists!");
    }
}
