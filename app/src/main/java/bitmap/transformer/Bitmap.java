package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Much of our reference came from https://stackoverflow.com/questions/16475482/how-can-i-load-a-bitmap-image-and-manipulate-individual-pixels
public class Bitmap {
    BufferedImage bitmap;
    int height;
    int width;

    public Bitmap (File bitmapPath){
        try {
            bitmap = ImageIO.read(bitmapPath);

            height = bitmap.getHeight();
            width = bitmap.getWidth();

        } catch (IOException ioException){
            System.out.println(Arrays.toString(ioException.getStackTrace()));
        }
    }

    // Greyscale formula was derived from google search
    public void transformToBlackAndWhite(File file){

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = bitmap.getRGB(x, y);
                Color color = new Color(rgb);
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                rgb = (red + green + blue)/3;
                bitmap.setRGB(x, y, rgb);
            }
        }

        try {
            ImageIO.write(bitmap, "bmp", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void transformIncreaseBrightness(File file){

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = bitmap.getRGB(x, y);
                Color color = new Color(rgb);

                bitmap.setRGB(x, y, color.brighter().getRGB());
            }
        }

        try {
            ImageIO.write(bitmap, "bmp", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
