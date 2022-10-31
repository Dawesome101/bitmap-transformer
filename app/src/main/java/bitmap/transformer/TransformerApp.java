package bitmap.transformer;

import java.io.File;

public class TransformerApp {
    public static void main(String[] args) {
        File sourceFile = new File(args[0]);
        File outputFile = new File(args[1]);

        Bitmap bitmap = new Bitmap(sourceFile);
        String transformType = args[2];

        if(transformType.equals("tbw")){
            bitmap.transformToBlackAndWhite(outputFile);
        }

        if(transformType.equals("tib")){
            bitmap.transformIncreaseBrightness(outputFile);
        }
    }
}
