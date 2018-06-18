import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.junit.Assert;

public class Test  {
    @org.junit.Test
    public void testIdentJPGS() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test1");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(true, x.compareImages());
        } catch (IOException e){}
    }

    @org.junit.Test
    public void testIdentResizedJPGS() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test2");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(false, x.compareImages());
        } catch (IOException e){}
    }

    @org.junit.Test
    public void testPNGS() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test3");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(true, x.compareImages());
        } catch (IOException e){}
    }

    @org.junit.Test
    public void testTIFS() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test4");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(true, x.compareImages());
        } catch (IOException e){}
    }

    @org.junit.Test
    public void testBMPS() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test5");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(true, x.compareImages());
        } catch (IOException e){}
    }

    @org.junit.Test
    public void testCut() {
        File folder = new File("C:/Users/Ojciec Mateusz/Desktop/projekt java/test6");
        File[] fileList = folder.listFiles();
        ImageChecker x = new ImageChecker();
        try {
            BufferedImage one = ImageIO.read(fileList[0]);
            BufferedImage two = ImageIO.read(fileList[1]);
            if(one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
                x.setOne(one);
                x.setTwo(two);
            }
            else {
                x.setOne(two);
                x.setTwo(one);
            }
            Assert.assertEquals(false, x.compareImages());
        } catch (IOException e){}
    }

}
