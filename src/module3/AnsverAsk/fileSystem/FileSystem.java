package module3.AnsverAsk.fileSystem;

public class FileSystem {
    private byte systemCode;
    private long capacityInBytes;
    private String name;
    private int foldersCount;
    private int filesCount;

    public FileSystem(byte systemCode, int filesCount, int foldersCount, String name, long capacityInBytes) {
        this.systemCode = systemCode;
        this.filesCount = 0;
        this.foldersCount =0;
        this.name = name;
        this.capacityInBytes = capacityInBytes;
    }

    public void setFoldersCount(int foldersCount) {
        this.foldersCount = foldersCount;
    }

    public void setFilesCount(int filesCount) {
        this.filesCount ++;
    }
}
