public class Pixrgb_19273899_RojasTorrealba extends Pixel_19273899_RojasTorrealba{
    private int red;
    private int green;
    private int blue;


    public Pixrgb_19273899_RojasTorrealba(int xPos, int yPos, int depth, int red, int green, int blue) {
        super(xPos, yPos, depth);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
