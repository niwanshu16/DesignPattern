package DesignPattern.CompositePattern.FileDirectory;

public class TestDrive {
    
    public static void main(String []args) {
        FileComponent file = new File("file1");
        FileComponent fileDirectory = new FileDirectory("Directory1");
        FileComponent fileDirectory2 = new FileDirectory("Directory2");
        fileDirectory2.addFile(file);
        fileDirectory.addFile(file);
        fileDirectory.addFile(fileDirectory2);
        fileDirectory.print();

    }

}
