package DesignPattern.CompositePattern.FileDirectory;

public class File implements FileComponent{
    
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void print() {
        System.out.print("/" + getName());
    }

    public void addFile(FileComponent file) {
        throw new UnsupportedOperationException("Method is not allowed");
    }
}
