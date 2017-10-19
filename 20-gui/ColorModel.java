package sew;

import java.awt.*;

public class ColorModel {
    private int x;
    private int y;
    private final int z;
    private final int height;
    private final int width;
    
    private ColorModel(Dimension size, int rectSize) {
        this.height = (int)size.getHeight();
        this.width = (int)size.getWidth();
        this.z = rectSize;
    }
}