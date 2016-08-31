package module3.AnsverAsk.fileSystem;

import javax.xml.crypto.Data;

public class TextFile extends File{
    private String nameOwnerName;
    private Data datecreated;

    public TextFile(long size, Folder folder) {
        super(size, folder);
    }

    public TextFile(long size, Folder folder, Data datecreated) {
        super(size, folder);
        this.datecreated = datecreated;
    }

    public TextFile(long size, Folder folder, String nameOwnerName) {
        super(size, folder);
        this.nameOwnerName = nameOwnerName;
    }

    public TextFile(long size, Folder folder, String nameOwnerName, Data datecreated) {
        super(size, folder);
        this.nameOwnerName = nameOwnerName;
        this.datecreated = datecreated;
    }
}
