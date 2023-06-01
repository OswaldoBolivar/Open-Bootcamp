 
// Para practicar la encapsulación:
// Crear clase Persona.
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
// Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


public class Tema8 {

    public static void main(String args[]) {
        Persona persona = new Persona();

        persona.setNombre("Jose");
        persona.setEdad(25);
        persona.setTelefono("555-555-555");

        System.out.println("Hola, mi nombre es " + persona.getNombre() + " " + persona.getEdad());
        System.out.println("tengo " + persona.getEdad() + " años");
        System.out.println("mi telefono es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
