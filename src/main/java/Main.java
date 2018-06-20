import javax.imageio.ImageIO;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Main {

    /* Projekt zaliczeniowy z przedmiotu Java,
    temat:Usuwanie zduplikowanych zdj z folderu
    Autorzy:
    Wojtasiewicz Dominika
    Staniszewski Mateusz
    Terkała Daniel
    Grupa nr.24 ,czwartek 12.45*/

    public static void main(String[] args) throws IOException {
        Scanner x = new Scanner(System.in);

        System.out.println("Podaj ścieżkę do folderu z którego mają być usunięte duplikaty zdjęć");
        String path=x.nextLine();

        deleteFromFolder del = new deleteFromFolder(path);
        del.delete();

    }


}