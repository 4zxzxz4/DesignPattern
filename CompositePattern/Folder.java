package CompositePattern;

import java.util.ArrayList;

// composite or whole object
public class Folder implements Node {

    private String folderName;
    protected ArrayList<File> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(File file) {
        files.add(file);
    }

    @Override
    public String getName() {
        StringBuffer folderTree = new StringBuffer(folderName);
        files.stream().forEach(file -> folderTree.append("\n - " + file.getName()));
        return folderTree.toString();
    }
}
