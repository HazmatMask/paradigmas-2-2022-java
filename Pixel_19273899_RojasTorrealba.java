/**
 * NOMBRE DE CLASE: PIXEL
 * DESCRIPCION: ENTREGA UNA FORMA PRIMITIVA Y UNA CLASE PADRE PARA LOS 3 TIPOS DISTINTOS DE PIXEL
 *              CON LOS QUE NOS ENCONTRAREMOS MAS ADELANTE: PIXBIT, PIXRGB Y PIXHEX.
 *
 * ATRIBUTOS:   POSEE 3 ATRIBUTOS QUE CORRESPONDEN A ENTEROS,DESIGNANDO SUS COORDENADAS HORIZONTAL
 *              Y VERTICALMENTE, AL IGUAL QUE LA PROFUNDIDAD DE ESTE PIXEL. ESTOS SON LOS 3 ATRIBUTOS
 *              QUE TODOS LOS TIPOS DE PIXEL DEFINIDOS EN ESTE PROGRAMA COMPARTEN.
 *
 * METODOS
 * PUBLICOS:    GETTERS + SETTERS.
 *              PIXELTOSTRING, COMO PLACEHOLDER PARA EL USO DE DICHO METODO EN SUS CLASES HIJA.
 *              DECTOHEX, PARA TRANSFORMAR DECIMALES EN SU EQUIVALENTE STRING HEXADECIMAL.
 *              PIXRGBTOHEX, COMO PLACEHOLDER PARA EL USO DE DICHO METODO EN SUS CLASES HIJA.
 *
 * RELACIONES:  DE HERENCIA CON CLASES PIXBIT, PIXRGB Y PIXHEX
 *              DE AGREGACION CON CLASE IMAGE
 */


public class Pixel_19273899_RojasTorrealba {
    private int xPos;
    private int yPos;
    private int depth;

    public Pixel_19273899_RojasTorrealba(int xPos, int yPos, int depth) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.depth = depth;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String pixelToString(){
        return "";
    }

    public String decToHex(Integer N){
        if (N < 10) {
            return String.valueOf(N);
        } else if (N == 10) {
            return "A";
        } else if (N == 11) {
            return "B";
        } else if (N == 12) {
            return "C";
        } else if (N == 13) {
            return "D";
        } else if (N == 14) {
            return "E";
        } else if (N == 15) {
            return "F";
        };
        return null;
    }

    public Pixhex_19273899_RojasTorrealba pixRGBToHEX(){
        return new Pixhex_19273899_RojasTorrealba(-1,-1,-1,"XXXXXX");
    }
}