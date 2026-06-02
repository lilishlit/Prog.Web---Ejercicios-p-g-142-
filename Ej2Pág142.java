//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;

// Clase abstracta padre
abstract class Mamiferos {

    protected String nombre;
    protected String raza;
    protected String tipoAnimal;
    protected String fechaNacimiento;
    protected float peso;

    public Mamiferos(String nombre, String raza, String tipoAnimal,
                     String fechaNacimiento, float peso) {

        this.nombre = nombre;
        this.raza = raza;
        this.tipoAnimal = tipoAnimal;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void tipoAnimal() {
        System.out.println("Tipo de animal: " + tipoAnimal);
    }

    // Método abstracto
    public abstract void comunicarse();
}

// Clase hija Perro
class Perro extends Mamiferos {

    private String lugarEntrenamiento;

    public Perro(String nombre, String raza, String tipoAnimal,
                 String fechaNacimiento, float peso,
                 String lugarEntrenamiento) {

        super(nombre, raza, tipoAnimal, fechaNacimiento, peso);
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    @Override
    public void comunicarse() {
        System.out.println("Guau Guau");
    }

    public void mostrarDatos() {
        System.out.println("\n DATOS DEL PERRO ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Tipo Animal: " + tipoAnimal);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso);
        System.out.println("Lugar de Entrenamiento: " + lugarEntrenamiento);
    }
}

// Clase hija Gato
class Gato extends Mamiferos {

    private double alturaSalto;

    public Gato(String nombre, String raza, String tipoAnimal,
                String fechaNacimiento, float peso,
                double alturaSalto) {

        super(nombre, raza, tipoAnimal, fechaNacimiento, peso);
        this.alturaSalto = alturaSalto;
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau Miau");
    }

    public void mostrarDatos() {
        System.out.println("\n DATOS DEL GATO ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Tipo Animal: " + tipoAnimal);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso);
        System.out.println("Altura de Salto: " + alturaSalto);
    }
}

// Clase principal
public class Ej2Pág142 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos del perro
        System.out.println("REGISTRO DEL PERRO");

        System.out.print("Nombre: ");
        String nombrePerro = sc.nextLine();

        System.out.print("Raza: ");
        String razaPerro = sc.nextLine();

        System.out.print("Fecha Nacimiento: ");
        String fechaPerro = sc.nextLine();

        System.out.print("Peso(en libras): ");
        float pesoPerro = sc.nextFloat();
        sc.nextLine();

        System.out.print("Lugar de Entrenamiento: ");
        String lugar = sc.nextLine();

        Perro perro = new Perro(
                nombrePerro,
                razaPerro,
                "Perro",
                fechaPerro,
                pesoPerro,
                lugar
        );

        // Datos del gato
        System.out.println("\n REGISTRO DEL GATO");

        System.out.print("Nombre: ");
        String nombreGato = sc.nextLine();

        System.out.print("Raza: ");
        String razaGato = sc.nextLine();

        System.out.print("Fecha Nacimiento: ");
        String fechaGato = sc.nextLine();

        System.out.print("Peso(en libras): ");
        float pesoGato = sc.nextFloat();

        System.out.print("Altura de Salto: ");
        double salto = sc.nextDouble();

        Gato gato = new Gato(
                nombreGato,
                razaGato,
                "Gato",
                fechaGato,
                pesoGato,
                salto
        );

        // Mostrar resultados
        System.out.println("\n==RESULTADOS DE REGISTRO==");

        perro.mostrarDatos();
        perro.comer();
        perro.tipoAnimal();
        perro.comunicarse();

        gato.mostrarDatos();
        gato.comer();
        gato.tipoAnimal();
        gato.comunicarse();

        sc.close();
    }
}
