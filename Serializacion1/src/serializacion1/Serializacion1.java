package serializacion1;
import java.io.*;

public class Serializacion1 {

    public static void main(String[] args) {
        ClaseSerializacion obx1,obx2;
        obx1= new ClaseSerializacion("texto generado por defecto",1,1.5);
        obx2= null;
        ObjectOutputStream fuera;
        ObjectInputStream dentro;
    
    try {
            fuera = new ObjectOutputStream(new FileOutputStream("serial"));
            fuera.writeObject(obx1);
            fuera.close();
        }catch (IOException e){
            System.out.println("no se pudo abrir el archivo");
        }
        System.out.println(obx1);
        try{
            dentro=new ObjectInputStream(new FileInputStream("serial"));
            obx2=(ClaseSerializacion)dentro.readObject();
            dentro.close();
        }catch(IOException e2){
            System.out.println("No se pudo abrir para leer el archivo");
        }catch (Exception e3){
            System.out.println("Objeto no encontrado");
        }

        System.out.println(obx2);
    }
}

