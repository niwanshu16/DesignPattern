package DesignPattern.CompositePattern.FileDirectory;

public interface FileComponent {
    
    public void print();

    public void addFile(FileComponent file);
}
