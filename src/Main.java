import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        createDir("C://Games", "src", str);
        createDir("C://Games", "res", str);
        createDir("C://Games", "savegames", str);
        createDir("C://Games", "temp", str);
        createDir("C://Games/src", "main", str);
        createDir("C://Games/src", "test", str);

        createFile("C://Games/src/main", "Main.java", str);
        createFile("C://Games/src/main", "Utils.java", str);

        createDir("C://Games/res", "drawables", str);
        createDir("C://Games/res", "vectors", str);
        createDir("C://Games/res", "icons", str);

        createFile("C://Games/temp", "temp.txt", str);


        try (FileWriter fwr = new FileWriter("C://Games/temp/temp.txt")) {
            fwr.write(String.valueOf(str));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void createDir(String path, String name, StringBuilder str) {
        if ((new File(path, name)).mkdir())
            str.append("папка: " + name + " в  " + path + " - создана, ");


    }

    public static void createFile(String path, String name, StringBuilder str) {
        try {
            if (new File(path, name).createNewFile()) str.append("файл: " + name + " в  " + path + " - создан, ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}