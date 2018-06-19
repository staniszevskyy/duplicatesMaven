import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public class deleteFromFolder extends ImageChecker {




        public static int Newton( int n, int k )
        {
            int  Wynik = 1;
            int i;

            for(i = 1; i <= k; i++)
            {
                Wynik = Wynik * ( n - i + 1 ) / i;
            }

            return Wynik;
        }



    String path;



    public deleteFromFolder(String path) throws IOException{
        this.path = path;
    }
    public void delete () throws IOException {
        int count=0;
        File folder = new File(path);
        int len;
        File[] fileList = folder.listFiles();
        if (fileList.length == 0) {
            return;
        }


        if (fileList.length == 2) {
            len = 2;
        }
        else {
            len = Newton (fileList.length, 2);

        }
        File[] deletionList = new File[len];

        int k=0;
        for (int i=0; i<fileList.length; i++){
            for (int j=i+1; j<fileList.length;j++){

                BufferedImage one = ImageIO.read(fileList[i]);
                BufferedImage two = ImageIO.read(fileList[j]);
                if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                    this.setOne(one);
                    this.setTwo(two);
                } else {
                    this.setOne(two);
                    this.setTwo(one);

                }

                if(this.compareImages()){

                    deletionList[k]=fileList[j];
                    k++;
                }
            }
        }

        for (int x=0; x<k; x++){
            File del=deletionList[x];
            boolean delete = del.delete();
            if (delete==true){
                count++;
            }
        }
        System.out.println("Usunięto "+count+" duplikatów.");
    }
}
