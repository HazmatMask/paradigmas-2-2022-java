public class Pixbit_19273899_RojasTorrealba extends Pixel_19273899_RojasTorrealba{
    private int value;

    public Pixbit_19273899_RojasTorrealba(int xPos, int yPos, int depth, int value){
        super(xPos,yPos,depth);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
