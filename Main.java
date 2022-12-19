import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BITMAP PREVIAMENTE CREADO

        ArrayList<Pixbit_19273899_RojasTorrealba> pixeles = new ArrayList<>();

        pixeles.add(new Pixbit_19273899_RojasTorrealba(2,1,0,1));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(0,0,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(1,1,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(2,0,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(1,0,0,1));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(0,1,0,1));

        Image_19273899_RojasTorrealba<Pixbit_19273899_RojasTorrealba> image19273899RojasTorrealba = new Image_19273899_RojasTorrealba<Pixbit_19273899_RojasTorrealba>(3,2,pixeles);

        System.out.println("BITMAP POR DEFECTO:\n"+image19273899RojasTorrealba.imageToString()[0]);

        //PIXMAP PREVIAMENTE CREADO

        ArrayList<Pixrgb_19273899_RojasTorrealba> pixeles2 = new ArrayList<>();

        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(2,1,0,10,20,30));
        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(0,0,0,0,10,20));
        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(1,1,0,10,20,30));
        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(2,0,0,0,10,20));
        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(1,0,0,10,20,30));
        pixeles2.add(new Pixrgb_19273899_RojasTorrealba(0,1,0,0,10,20));

        Image_19273899_RojasTorrealba<Pixrgb_19273899_RojasTorrealba> image19273899RojasTorrealba2 = new Image_19273899_RojasTorrealba<Pixrgb_19273899_RojasTorrealba>(3,2,pixeles2);

        System.out.println("PIXMAP POR DEFECTO:\n"+image19273899RojasTorrealba2.imageToString()[0]);

        //HEXMAP PREVIAMENTE CREADO

        ArrayList<Pixhex_19273899_RojasTorrealba> pixeles3 = new ArrayList<>();

        pixeles3.add(new Pixhex_19273899_RojasTorrealba(2,1,0,"AABBCC"));
        pixeles3.add(new Pixhex_19273899_RojasTorrealba(0,0,0,"001122"));
        pixeles3.add(new Pixhex_19273899_RojasTorrealba(1,1,0,"AABBCC"));
        pixeles3.add(new Pixhex_19273899_RojasTorrealba(2,0,0,"001122"));
        pixeles3.add(new Pixhex_19273899_RojasTorrealba(1,0,0,"AABBCC"));
        pixeles3.add(new Pixhex_19273899_RojasTorrealba(0,1,0,"001122"));

        Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba> image19273899RojasTorrealba3 = new Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba>(3,2,pixeles3);

        System.out.println("HEXMAP POR DEFECTO:\n"+image19273899RojasTorrealba3.imageToString()[0]);

        image19273899RojasTorrealba2.imgRGBtoHEX();

        Scanner myObj = new Scanner(System.in);
        System.out.println("### Editor de imágenes ###\n" +
                "Escoja su opción:\n" +
                "1. Voltear imagen horizontalmente.\n" +
                "2. Voltear imagen verticalmente.\n" +
                "3. Recortar imagen.\n" +
                "4. Verificar si imagen es un Bitmap\n" +
                "5. Verificar si imagen es un Pixmap\n" +
                "6. Verificar si imagen es un Hexmap\n" +
                "7. Rotar en sentido antihorario la imagen.\n" +
                "8. Transformar una imagen desde notacion RGB a Hexadecimal." +
                "9. Cambiar un pixel por otro ingresado (EL INGRESO DE ESTE SERA REALIZADO AUTOMATICAMENTE\n" +
                "POR EL PROGRAMA, DESDE UN PIXEL YA CREADO EN MEMORIA).\n" +
                "10. Invertir valores de un Bitmap.\n" +
                "11. Invertir colores RGB de un Pixmap.\n" + "INTRODUZCA SU OPCIÓN:");

        Integer option = myObj.nextInt();

        //Integer option = 11;

        if (option == 1){

            image19273899RojasTorrealba.flipH();

        } else if (option == 2) {

            image19273899RojasTorrealba.flipV();

        } else if (option == 3) {

            Scanner obj_x1 = new Scanner(System.in);
            Scanner obj_y1 = new Scanner(System.in);
            Scanner obj_x2 = new Scanner(System.in);
            Scanner obj_y2 = new Scanner(System.in);
            System.out.println("ingrese 4 valores (x1, y1, x2 e y2), correspondientes a los dos puntos más alejados entre sí, dentro de la selección que se desea recortar.\n");

            Integer x1 = obj_x1.nextInt();
            Integer y1 = obj_y1.nextInt();
            Integer x2 = obj_x2.nextInt();
            Integer y2 = obj_y2.nextInt();

            image19273899RojasTorrealba.crop(x1,y1,x2,y2);}

        else if (option == 4) System.out.println(image19273899RojasTorrealba.isBitmap());

        else if (option == 5) System.out.println(image19273899RojasTorrealba.isPixmap());

        else if (option == 6) System.out.println(image19273899RojasTorrealba.isHexmap());

        else if (option == 7) image19273899RojasTorrealba.rotate90();

        else if (option == 8){

            System.out.println(image19273899RojasTorrealba2.imageToString()[0]);
            Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba> image19273899RojasTorrealba4 = image19273899RojasTorrealba2.imgRGBtoHEX();
            System.out.println(image19273899RojasTorrealba4.imageToString()[0]);

        }else if (option == 9){

            Pixhex_19273899_RojasTorrealba pix_in = new Pixhex_19273899_RojasTorrealba(0,0,0,"334455");
            Image_19273899_RojasTorrealba<Pixhex_19273899_RojasTorrealba> image19273899RojasTorrealba4 = image19273899RojasTorrealba3.changePixel(pix_in);
            System.out.println(image19273899RojasTorrealba4.imageToString()[0]);

        }else if (option == 10){

            System.out.println(image19273899RojasTorrealba.imageToString()[0]);
            image19273899RojasTorrealba.invertColorBit();
            System.out.println(image19273899RojasTorrealba.imageToString()[0]);

        }else if (option == 11){
            System.out.println(image19273899RojasTorrealba2.imageToString()[0]);
            image19273899RojasTorrealba2.invertColorRGB();
            System.out.println(image19273899RojasTorrealba2.imageToString()[0]);
        }
    }
}