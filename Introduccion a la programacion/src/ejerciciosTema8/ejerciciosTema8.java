package ejerciciosTema8;

public class ejerciciosTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        System.out.println(persona.getEdad());
        persona.setNombre("Pepito");
        System.out.println(persona.getNombre());
        persona.setTelefono(112586786);
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
