import java.lang.reflect.Array;
import java.util.ArrayList;

public interface MapType_19273899_RojasTorrealba {
    public boolean isBitmap();
    public  boolean isPixmap();
    public boolean isHexmap();
}

public interface Compression_19273899_RojasTorrealba {

    public boolean isCompressed();
    public void compress();
    public void decompress();
}

public interface Editable_19273899_RojasTorrealba {
    public void flipH();
    public void flipV();
    public void crop(int x1, int y1, int x2, int y2);
    public void rotate90();
}

public interface Image_Interface_19273899_RojasTorrealba {

    public ArrayList histogram();

    public void changePixel();

    public String imageToString();

    // public ? depthLayers();
}
