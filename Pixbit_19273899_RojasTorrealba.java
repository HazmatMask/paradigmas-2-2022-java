public class Pixbit_19273899_RojasTorrealba extends Pixel_19273899_RojasTorrealba{
    private Integer value;

    public Pixbit_19273899_RojasTorrealba(Integer xPos, Integer yPos, Integer depth, Integer value){
        super(xPos,yPos,depth);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String pixelToString(){
        return String.valueOf(getValue());
    }
}
