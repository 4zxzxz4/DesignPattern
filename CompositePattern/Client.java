package CompositePattern;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        File file4 = new File("file4");
        File file5 = new File("file5");
        Folder folder = new Folder("MyFavorite");
        folder.add(file4);
        folder.add(file5);

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(file1);
        nodes.add(file2);
        nodes.add(file3);
        nodes.add(folder);

        nodes.forEach(node -> System.out.println(node.getName()));
    }
}
