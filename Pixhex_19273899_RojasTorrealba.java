/**
 * NOMBRE DE CLASE: PIXHEX (CLASE HIJA DE PIXEL)
 * DESCRIPCION: PIXEL CON VALOR HEXADECIMAL ASOCIADO.
 *
 * ATRIBUTOS:   APARTE DE LOS ATRIBUTOS HEREDADOS DE SU CLASE PADRE, POSEE UN STRING
 *              QUE CORRESPONDE A SUS VALOR HEXADECIMAL DE COLOR.
 *
 * METODOS
 * PUBLICOS:    GETTERS + SETTERS.
 *              PIXELTOSTRING, ENTREGA STRING ASOCIADO AL PIXEL.
 *
 *
 * RELACIONES:  DE HERENCIA CON CLASE PIXEL
 *              DE AGREGACION CON CLASE IMAGE
 */
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

    public String pixelToString(){
        return getHexValue()+"\t";
    }
}
