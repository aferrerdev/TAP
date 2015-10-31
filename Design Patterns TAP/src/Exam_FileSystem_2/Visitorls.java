package Exam_FileSystem_2;

import Exam_FileSystem.*;

/**
 * Created by Alex on 31/10/2015.
 */
public class Visitorls
{

    // Method ls for Files.
    public void ls(File file, VisitorToString visitor)
    {
        System.out.println(file.toString(visitor));
    }

    // Method ls for Directory
    public void ls(Directory directory, VisitorToString visitor)
    {
        Visitorls vLs = this;
        directory.getChildren().forEach((file -> file.accept_ls(vLs, visitor)));
    }
}
