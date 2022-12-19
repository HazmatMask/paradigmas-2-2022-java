import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Image_19273899_RojasTorrealba <P extends Pixel_19273899_RojasTorrealba> implements MapType_19273899_RojasTorrealba,Compression_19273899_RojasTorrealba,Editable_19273899_RojasTorrealba{

    private Integer width;
    private Integer height;
    private ArrayList<P> pixeles;
    private ArrayList compressedBit;

    public Image_19273899_RojasTorrealba(Integer width, Integer height, ArrayList<P> pixeles) {
        this.width = width;
        this.height = height;
        this.pixeles = pixeles;
        this.compressedBit = null;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ArrayList<P> getPixeles() {
        return pixeles;
    }

    public void setPixeles(ArrayList<P> pixeles) {
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
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixbit_19273899_RojasTorrealba);
    }

    @Override
    public boolean isPixmap() {
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixrgb_19273899_RojasTorrealba);
    }

    @Override
    public boolean isHexmap() {
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixhex_19273899_RojasTorrealba);
    }

    @Override
    public boolean isCompressed() {
        return (this.compressedBit != null);
    }

    @Override
    public void compress() {

    }

    @Override
    public void decompress() {

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
    public void rotate90() {
        this.pixeles.forEach(pixel -> {int xPosaux = pixel.getxPos(); pixel.setxPos(this.height - 1 - pixel.getyPos()); pixel.setyPos(-xPosaux);});
    }

    public String[] imageToString(){
        this.pixeles.stream().sorted(Comparator.comparingInt(P::getxPos)).collect(Collectors.toList());
        this.pixeles.stream().sorted(Comparator.comparingInt(P::getyPos)).collect(Collectors.toList());

        final String[] aux = {""};
        pixeles.forEach(pixel -> aux[0] = aux[0].concat(String.valueOf(pixel.getxPos())+","+String.valueOf(pixel.getyPos())+"; "));

        return aux;
    }
}
