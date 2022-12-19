import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //IMAGEN PREVIAMENTE CREADA

        List<Integer> prueba = Arrays.asList(1,2,3,4,5,6,7,8,9,3,4,5,6,7,3,8,6);
        System.out.println(prueba.stream().distinct());

        List<Pixbit_19273899_RojasTorrealba> pixeles = new ArrayList<>();

        pixeles.add(new Pixbit_19273899_RojasTorrealba(0,0,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(1,0,0,1));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(2,0,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(0,1,0,1));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(1,1,0,0));
        pixeles.add(new Pixbit_19273899_RojasTorrealba(2,1,0,1));


        //

        Pixrgb_19273899_RojasTorrealba test = new Pixrgb_19273899_RojasTorrealba(0,0,10,20,30,4);

        System.out.println();

        Scanner myObj = new Scanner(System.in);
        System.out.println("### Manipulador de imágenes ###\n" +
                "Escoja su opción:\n" +
                "1. Voltear imagen horizontalmente.\n" +
                "2. Voltear imagen verticalmente.\n" +
                "3. Recortar imagen.\n" +
                "4. Verificar si imagen es un Bitmap\n" +
                "5. Verificar si imagen es un Pixmap\n" +
                "6. Verificar si imagen es un Hexmap\n" + "INTRODUZCA SU OPCIÓN:");

        Integer option = myObj.nextInt();

        if (option == 1){

            //image_Class_19273899_rojasTorrealba.flipH();

        } else if (option == 2) {

            //image_Class_19273899_rojasTorrealba.flipV();

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

            //image_Class_19273899_rojasTorrealba.crop(x1,y1,x2,y2);

        } else if (option == 4) {

            //image_Class_19273899_rojasTorrealba.isBitmap();

        } else if (option == 5) {

            //image_Class_19273899_rojasTorrealba.isPixmap();

        }else if (option == 6){

            //image_Class_19273899_rojasTorrealba.isHexmap();

        }
    }
}