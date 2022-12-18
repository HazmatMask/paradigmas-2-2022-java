import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Image_Interface_19273899_RojasTorrealba {

    public boolean isBitmap();
    public  boolean isPixmap();
    public boolean isHexmap();
    public boolean isCompressed();

    public void flipH();
    public void flipV();
    public void crop(int x1, int y1, int x2, int y2);

    public ArrayList histogram();

    public void rotate90();

    public void compress();

    public void changePixel();

    public String imageToString();

    // public ? depthLayers();

    public void decompress();
}
