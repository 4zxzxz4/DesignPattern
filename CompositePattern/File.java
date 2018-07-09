package CompositePattern;

// leaf or part object
public class File implements Node {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getName() {
        return fileName;
    }
}
