package CompositeDesignPatternFileSystemLLD;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    //A directory contains other directory and files
    List<FileSystem> list;
    public Directory(String directoryName)
    {
        this.directoryName = directoryName;
        list = new ArrayList<>();
    }
    @Override
    public void ls() {

        System.out.println("Directory --> "+ directoryName);
        System.out.println("Child's of this directory");
        for(FileSystem file : list)
        {
            file.ls();
        }

    }
    void add(FileSystem file)
    {
        list.add(file);
    }
}
