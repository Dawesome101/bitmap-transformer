# bitmap-transformer

Designed to transform and mutate a bitmap file.

## Transform Black & White

Takes in a bitmap and transforms the image to greyscale.

To transform an image to black and white use the desired path with filename as the first argument and the desired path and filename for the output file. For the final argument, pass "twb" (Transform Black & White).

Example:

`./gradlew run --args "src/main/resources/baldy-8bit.bmp src/main/resources/test1.bmp twb"`


## Transform Increase Brightness

Increases the brightness level of an image.

To raise the brightness of an image use the desired path with a filename as the first argument and the desired path and filename for the output file. For the final argument, pass "tib" (Transform Increase Brightness)

Example:

`./gradlew run --args "src/main/resources/baldy-8bit.bmp src/main/resources/test2.bmp tib"`