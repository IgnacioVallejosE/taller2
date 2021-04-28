import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Taller02UnitTesting {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        String archivo = "C:\\Users\\Asus\\Desktop\\cosas de progra\\taller2\\cadenas.txt";
        //metodo creado para saber si el archivo existe
        validarArchivo(archivo);
        //lee y analiza los datos del archivo
        lecturaArchivo(archivo);
        //crea un ArrayList para almacenar las lineas del archivo
        ArrayList<String> interno = lecturaArchivo(archivo);
        //para print del contenido en la pantalla
        // muestraDeLineas(interno);
        System.out.println("la cantidad de lineas es " + interno.size());
        //no terminado
        //contarPalindromos(interno);
    }

    public static boolean validarArchivo(String ruta) {
        File file = new File(ruta);
        return file.isFile();
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

    private static void contarPalindromos(ArrayList<String> interno) {
        String[] palindromo;
        for (int i = 0; i > interno.size() ; i++) {
             palindromo = interno.get(0).split(";");
        }

        }
    }