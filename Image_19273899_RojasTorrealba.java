import java.awt.*;
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
    public void crop(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.pixeles = (ArrayList<P>) this.pixeles.stream().filter(pixel -> pixel.getxPos() > x1-1
        && pixel.getxPos() < x2+1 && pixel.getyPos() > y1-1 && pixel.getyPos() < y2+1).collect(Collectors.toList());
    }

    @Override
    public void rotate90() {
        this.pixeles.forEach(pixel -> {int xPosaux = pixel.getxPos(); pixel.setxPos(this.height - 1 - pixel.getyPos()); pixel.setyPos(-xPosaux);});
        Integer aux = this.width;

        this.width = this.height;
        this.height = aux;
    }

    public Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba> imgRGBtoHEX(){
        ArrayList<Pixhex_19273899_RojasTorrealba> pix_in = new ArrayList<>();
        this.pixeles.forEach(pixel -> pix_in.add(pixel.pixRGBToHEX()));
        return new Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba>(this.width,this.height,pix_in);
    }

    public Image_19273899_RojasTorrealba<P> changePixel(P pixel_in) {
        ArrayList<P> pixel_list = new ArrayList<>();
        if (width > pixel_in.getxPos() && height > pixel_in.getyPos() & ((this.isBitmap() && pixel_in instanceof Pixbit_19273899_RojasTorrealba)
                || (this.isPixmap() && pixel_in instanceof Pixrgb_19273899_RojasTorrealba)
                || (this.isHexmap() && pixel_in instanceof Pixhex_19273899_RojasTorrealba))) {
            this.pixeles.stream().forEach(pixel -> {if (pixel.getxPos() == pixel_in.getxPos() && pixel.getyPos() == pixel_in.getyPos()){
                pixel_list.add(pixel_in);}else{pixel_list.add(pixel);}});
        };
        return (new Image_19273899_RojasTorrealba(this.width,this.height,pixel_list));
    }

    public String[] imageToString(){
        this.pixeles.sort(Comparator.comparing(P::getxPos));
        this.pixeles.sort(Comparator.comparing(P::getyPos));

        final String[] aux = {""};
        this.pixeles.forEach(pixel -> {aux[0] = aux[0].concat(pixel.pixelToString());
                                        if (pixel.getxPos()+1 == width){
                                        aux[0] = aux[0].concat("\n");};
                }
        );

        return aux;
    }
}
