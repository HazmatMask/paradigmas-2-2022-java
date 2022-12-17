public interface Image_Interface_19273899_RojasTorrealba {

    public boolean isBitmap();
    public  boolean isPixmap();
    public boolean isHexmap();
    public boolean isCompressed();

    public void flipH();
    public void flipV();
    public void crop();

    public void imgRGBtoHEX();

    // public ? histogram();

    public void rotate90();

    public void compress();

    public void changePixel();
    public void invertColorBit();
    public void invertColorRGB();

    public String image->string();

    // public ? depthLayers();

    public void decompress();
}
