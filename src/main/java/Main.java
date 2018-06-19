import javax.imageio.ImageIO;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Main {



    public static void main(String[] args) throws IOException {
        Scanner x = new Scanner(System.in);
        String path;
        System.out.println("Podaj ścieżkę do folderu z którego mają być usunięte duplikaty zdjęć");
        path=x.nextLine();
        deleteFromFolder del = new deleteFromFolder(path);
        del.delete();

    }


}