public class Pixhex_19273899_RojasTorrealba extends Pixel_19273899_RojasTorrealba{
    private String hexValue;


    public Pixhex_19273899_RojasTorrealba(Integer xPos, Integer yPos, Integer depth, String hexValue) {
        super(xPos, yPos, depth);
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }
}
