import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Main {
    public static int factorial(int n){
        int out=n;
        for(int i=n-1; i>0; i--){
            out*=i;
        }
        return out;
    }

    public static void main(String[] args) throws IOException {

        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/zdjecia");
        int len;
        File[] fileList = folder.listFiles();
        if (fileList.length == 0) {
            return;
        }

        if (fileList.length == 2) {
            len = 2;
        }
        else {
            len = factorial(fileList.length) / factorial(fileList.length - 2) * 2;
        }
        File[] deletionList = new File[len];

        int k=0;
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

                }

                if(x.compareImages()){

                    deletionList[k]=fileList[j];
                    k++;
                }
            }
        }

        for (int x=0; x<k; x++){
            File del=deletionList[x];
            del.delete();
        }
    }


}