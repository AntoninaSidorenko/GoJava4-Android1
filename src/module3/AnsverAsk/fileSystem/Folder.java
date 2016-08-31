package module3.AnsverAsk.fileSystem;

public class Folder {
    File[] files = new File[Integer.MAX_VALUE];
    private String path;
    private int index = 0;

    public Folder(String path) {
        this.path = path;
    }

    public void setFiles(File file) {

        files[index] = file;
        index ++;
    }
}
