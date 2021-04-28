import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Taller02UnitTesting {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        String archivo = "C:\\Users\\Asus\\Desktop\\cosas de progra\\taller2\\cadenas.txt";
        lecturaArchivo(archivo);
        ArrayList<String> interno = lecturaArchivo(archivo);
        muestraDeLineas(interno);
    }


    private static ArrayList<String> lecturaArchivo(String archivo) {
        ArrayList<String> lineas = new ArrayList<>();
        String cadenas;
        FileReader fr;
        try {
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((cadenas = br.readLine()) != null) {
                lineas.add(cadenas);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    private static void muestraDeLineas(ArrayList<String> interno) {
        System.out.println("=======================");
        for (int i = 0; i < interno.size(); i++) {
            String[] contenido = interno.get(i).split(";");
            if (i!=interno.size()-1)
                System.out.println(""+contenido[0]+", ");
            else
                System.out.println(""+contenido[0]);
        }
        System.out.println("=======================");
    }
}