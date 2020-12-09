package serializacion1;
import java.io.Serializable;

public class ClaseSerializacion implements Serializable{
    private String nombre;
    private int num1;
    private double num2;

    public ClaseSerializacion(String nombre, int num1, double num2) {
        this.nombre = nombre;
        this.num1 = num1;
        this.num2 = num2;
    }
        public ClaseSerializacion() {
        this("null",0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int numero1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double numero2) {
        this.num2 = num2;
    }
    @Override
    public String toString() {
        return "ClaseSerializacion{" +
                "nombre='" + nombre + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
