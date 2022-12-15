import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Image_19273899_RojasTorrealba {
    private int width;
    private int height;
    private List<? extends Pixel_19273899_RojasTorrealba> pixeles;

    public Image_19273899_RojasTorrealba(int width, int height, List<? extends Pixel_19273899_RojasTorrealba> pixeles) {
        this.width = width;
        this.height = height;
        this.pixeles = pixeles;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<? extends Pixel_19273899_RojasTorrealba> getPixeles() {
        return pixeles;
    }

    public void setPixeles(List<? extends Pixel_19273899_RojasTorrealba> pixeles) {
        this.pixeles = pixeles;
    }

    public boolean isBitmap() {
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixbit_19273899_RojasTorrealba);
    }

    public boolean isPixmap() {
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixrgb_19273899_RojasTorrealba);
    }

    public boolean isHexmap() {
        return pixeles.stream().allMatch(pixel -> pixel instanceof Pixhex_19273899_RojasTorrealba);
    }

    public void flipH() {
        this.pixeles.stream().forEach(pixel -> pixel.setxPos(this.width - 1 - pixel.getxPos()));
    }

    public void flipV() {
        this.pixeles.stream().forEach(pixel -> pixel.setyPos(this.height - 1 - pixel.getyPos()));
    }

    public void crop(int x1, int y1, int x2, int y2) {
        this.pixeles = this.pixeles.stream().filter(pixel -> pixel.getxPos() > x1 && pixel.getxPos() < x2
                && pixel.getyPos() > y1 && pixel.getyPos() < y2).collect(Collectors.toList());
    }
}
