/**
 * NOMBRE DE CLASE: PIXBIT (CLASE HIJA DE PIXEL)
 * DESCRIPCION: PIXEL CON VALOR BINARIO ASOCIADO.
 *
 * ATRIBUTOS:   APARTE DE LOS ATRIBUTOS HEREDADOS DE SU CLASE PADRE, POSEE UN INTEGER ASOCIADO
 *              QUE CORRESPONDE A SU VALOR BINARIO.
 *
 * METODOS
 * PUBLICOS:    GETTERS + SETTERS.
 *              PIXELTOSTRING, ENTREGA EL STRING DEL VALOR ALMACENADO EN DICHO PIXBIT.
 *
 *
 * RELACIONES:  DE HERENCIA CON CLASE PIXEL
 *              DE AGREGACION CON CLASE IMAGE
 */
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
