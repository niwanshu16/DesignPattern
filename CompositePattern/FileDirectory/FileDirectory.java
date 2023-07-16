package DesignPattern.CompositePattern.FileDirectory;

import java.util.ArrayList;
import java.util.List;

public class FileDirectory implements FileComponent {
    
    List<FileComponent> files;
    String name;
    
    public FileDirectory(String name) {
        files = new ArrayList<>();
        this.name = name;
    }
    public void addFile(FileComponent fileComponent) {
        files.add(fileComponent);
    }

    public String getName() {
        return name;
    }
    public void print() {

        System.out.print("/" + getName());

        for(FileComponent file:files) 
            file.print();
        
        System.out.println();
    }
}
