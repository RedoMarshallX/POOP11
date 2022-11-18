package poop11extra;

public class Alumno {
    private String nombre;
    private String apNombre;
    private String apMaterno;
    private String numcuenta;
    private String edad;
    
    public Alumno() {
    }
    
    public Alumno(String nombre, String apNombre, String apMaterno, String numcuenta, String edad) {
        this.nombre = nombre;
        this.apNombre = apNombre;
        this.apMaterno = apMaterno;
        this.numcuenta = numcuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApNombre() {
        return apNombre;
    }

    public void setApNombre(String apNombre) {
        this.apNombre = apNombre;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre+","+apNombre+","+apMaterno+","+numcuenta+","+edad;
    }
}
