import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hexmap_19273899_RojasTorrealba extends Image_Class_19273899_RojasTorrealba implements MapType_19273899_RojasTorrealba,Compression_19273899_RojasTorrealba,Editable_19273899_RojasTorrealba{

    private ArrayList<Pixhex_19273899_RojasTorrealba> pixeles;
    private ArrayList compressedBit;

    public Hexmap_19273899_RojasTorrealba(int width, int height, ArrayList<Pixhex_19273899_RojasTorrealba> pixeles) {
        super(width, height);
        this.pixeles = pixeles;
        this.compressedBit = null;
    }


    public ArrayList<Pixhex_19273899_RojasTorrealba> getPixeles() {
        return pixeles;
    }

    public void setPixeles(ArrayList<Pixhex_19273899_RojasTorrealba> pixeles) {
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
        return false;
    }

    @Override
    public boolean isPixmap() {
        return false;
    }

    @Override
    public boolean isHexmap() {
        return true;
    }

    @Override
    public boolean isCompressed() {
        return (this.getCompressedBit() != null);
    }

    @Override
    public void flipH() {
        this.pixeles.stream().forEach(pixel -> pixel.setxPos(this.width - 1 - pixel.getxPos()));
    }

    @Override
    public void flipV() {
        this.pixeles.stream().forEach(pixel -> pixel.setyPos(this.height - 1 - pixel.getyPos()));
    }

    @Override
    public void crop(int x1, int y1, int x2, int y2) {
        this.pixeles.stream().filter(pixel -> pixel.getxPos() > x1 && pixel.getxPos() < x2
                && pixel.getyPos() > y1 && pixel.getyPos() < y2).collect(Collectors.toList());
    }

    @Override
    public ArrayList histogram(){

        return null;
    }

    @Override
    public void rotate90() {
        this.pixeles.stream().forEach(pixel -> {int xPosaux = pixel.getxPos(); pixel.setxPos(this.height - 1 - pixel.getyPos()); pixel.setyPos(-xPosaux);});
    }

    @Override
    public void compress() {

    }

    @Override
    public void changePixel() {

    }

    @Override
    public String imageToString() {
        return "NULO";
    }

    @Override
    public void decompress() {
    }
}

