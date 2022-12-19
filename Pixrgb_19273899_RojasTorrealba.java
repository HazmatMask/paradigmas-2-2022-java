public class Pixrgb_19273899_RojasTorrealba extends Pixel_19273899_RojasTorrealba{
    private Integer red;
    private Integer green;
    private Integer blue;


    public Pixrgb_19273899_RojasTorrealba(Integer xPos, Integer yPos, Integer depth, Integer red, Integer green, Integer blue) {
        super(xPos, yPos, depth);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }
}
