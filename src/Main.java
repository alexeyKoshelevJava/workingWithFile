import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        File dir1 = new File("C://Games", "src");
        if (dir1.mkdir()) str.append(" каталог src создан, ");
        File dir2 = new File("C://Games", "res");
        if (dir2.mkdir()) str.append(" каталог res создан, ");
        File dir3 = new File("C://Games", "savegames");
        if (dir3.mkdir()) str.append(" каталог savegames создан, ");
        File dir4 = new File("C://Games", "temp");
        if (dir4.mkdir()) str.append(" каталог temp создан, ");
        File dir5 = new File("C://Games/src", "main");
        if (dir5.mkdir()) str.append(" каталог main в src создан, ");
        File dir6 = new File("C://Games/src", "test");
        if (dir6.mkdir()) str.append(" каталог test в src создан, ");

        File file1 = new File("C://Games/src/main", "Main.java");
        try {
            if (file1.createNewFile()) str.append(" файл Main.java  в main создан, ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File file2 = new File("C://Games/src/main", "Utils.java");
        try {
            if (file2.createNewFile()) str.append(" файл Utils.java  в main создан, ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir7 = new File("C://Games/res", "drawables");
        if (dir7.mkdir()) str.append(" каталог drawables в res создан, ");
        File dir8 = new File("C://Games/res", "vectors");
        if (dir8.mkdir()) str.append(" каталог vectors в res создан, ");
        File dir9 = new File("C://Games/res", "icons");
        if (dir9.mkdir()) str.append(" каталог icons в res создан, ");

        File file3 = new File("C://Games/temp", "temp.txt");
        try {
            if (file3.createNewFile()) str.append(" файл temp.txt в temp создан, ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try (FileWriter fwr = new FileWriter("C://Games/temp/temp.txt")) {
            fwr.write(String.valueOf(str));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
