import java.util.ArrayList;

public class Bitmap_19273899_RojasTorrealba extends Image_Class_19273899_RojasTorrealba implements Image_Interface_19273899_RojasTorrealba{

    private ArrayList<Pixbit_19273899_RojasTorrealba> pixeles;
    private ArrayList compressedBit;

    public Bitmap_19273899_RojasTorrealba (int x, int y, ArrayList<Pixbit_19273899_RojasTorrealba> pixeles){
        super(x,y);
        this.pixeles = pixeles;
        this.compressedBit = [];
    }

    @Override
    public ArrayList<Pixbit_19273899_RojasTorrealba> getPixeles() {
        return pixeles;
    }

    public void setPixeles(ArrayList<Pixbit_19273899_RojasTorrealba> pixeles) {
        this.pixeles = pixeles;
    }

    public ArrayList getCompressedBit() {
        return compressedBit;
    }

    public void setCompressedBit(ArrayList compressedBit) {
        this.compressedBit = compressedBit;
    }

    @Override
    public boolean isBitmap() {
        return true;
    }

    @Override
    public boolean isPixmap() {
        return false;
    }

    @Override
    public boolean isHexmap() {
        return false;
    }

    @Override
    public boolean isCompressed() {
        return (if (this.getCompressedBit() != []));
    }

    @Override
    public void imgRGBtoHEX() {
        return false;
    }

    @Override
    public void compress() {

    }

    @Override
    public void changePixel() {

    }

    @Override
    public void invertColorBit() {
        
    }

    @Override
    public void invertColorRGB() {

    }

    @Override
    public String imageToString() {
        return null;
    }

    @Override
    public void decompress() {

    }
}
