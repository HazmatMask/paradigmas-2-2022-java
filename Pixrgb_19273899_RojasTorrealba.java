/**
 * NOMBRE DE CLASE: PIXRGB (CLASE HIJA DE PIXEL)
 * DESCRIPCION: PIXEL CON VALOR RGB ASOCIADO.
 *
 * ATRIBUTOS:   APARTE DE LOS ATRIBUTOS HEREDADOS DE SU CLASE PADRE, POSEE TRES INTEGER ASOCIADOS
 *              QUE CORRESPONDE A SUS VALORES EN LOS TRES CANALES RGB.
 *
 * METODOS
 * PUBLICOS:    GETTERS + SETTERS.
 *              PIXELTOSTRING, ENTREGA TEMPLATE CON VALORES RGB ASOCIADOS AL PIXEL.
 *              PIXRGBTOHEX, TRANSFORMA UN PIXEL RGB EN SU ANALOGO HEXADECIMAL.
 *
 *
 * RELACIONES:  DE HERENCIA CON CLASE PIXEL
 *              DE AGREGACION CON CLASE IMAGE
 */
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

    public String pixelToString(){
        return "R:"+String.valueOf(getRed())+";G:"+String.valueOf(getGreen())+";B:"+String.valueOf(getBlue())+"\t";
    }

    public Pixhex_19273899_RojasTorrealba pixRGBToHEX(){

        String aux = decToHex(this.getRed()/16)+decToHex(this.getRed()%16)+
                decToHex(this.getGreen()/16)+decToHex(this.getGreen()%16)+
                decToHex(this.getBlue()/16)+decToHex(this.getBlue()%16);
        return new Pixhex_19273899_RojasTorrealba(this.getxPos(),this.getyPos(),this.getDepth(),aux);
    }
}
