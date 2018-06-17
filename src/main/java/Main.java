import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main {
    //ZMIANA
    public static void main(String[] args) throws IOException {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/zdjecia");
        File[] fileList = folder.listFiles();

        for (int i=0; i<fileList.length; i++){
            for (int j=i+1; j<fileList.length;j++){
                ImageChecker x = new ImageChecker();
                BufferedImage one = ImageIO.read(fileList[i]);
                BufferedImage two = ImageIO.read(fileList[j]);
                if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                    x.setOne(one);
                    x.setTwo(two);
                } else {
                    x.setOne(two);
                    x.setTwo(one);
                    //testowa zmiana
                }
                System.out.println("Zdjecie " + fileList[i] + " oraz zdjecie " + fileList[j]+":");
                System.out.println(x.compareImages());
            }
        }


    }
}