package fileManager;

public class Main {
    public static void main(String[] args) {
        DirectoryManager directoryManager = new DirectoryManager();
        directoryManager.readDirectory("/home/eduard/Downloads");
    }
}
