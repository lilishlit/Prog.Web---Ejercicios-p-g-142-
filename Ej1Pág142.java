import java.util.Scanner;

// Interfaz
interface IMamiferos {
    void comunicarse();
}

// Clase padre
class Mamiferos implements IMamiferos {

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

    @Override
    public void comunicarse() {
        System.out.println("El mamífero se comunica.");
    }
}

// Clase Perro
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
        System.out.println(nombre + " dice: Guau Guau");
    }

    public void mostrarDatos() {
        System.out.println("\n Registro del perro");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: " + tipoAnimal);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso + " lbs");
        System.out.println("Lugar de entrenamiento: " + lugarEntrenamiento);
    }
}

// Clase Gato
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
        System.out.println(nombre + " dice: Miau Miau");
    }

    public void mostrarDatos() {
        System.out.println("\n----- DATOS DEL GATO -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: " + tipoAnimal);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso + "lbs");
        System.out.println("Altura de salto: " + alturaSalto + " m");
    }
}

// Clase principal
public class Ej1Pág142 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos del perro
        System.out.println("Ingrese los datos del perro");

        System.out.print("Nombre: ");
        String nombrePerro = sc.nextLine();

        System.out.print("Raza: ");
        String razaPerro = sc.nextLine();

        System.out.print("Fecha de nacimiento: ");
        String fechaPerro = sc.nextLine();

        System.out.print("Peso (en libras): ");
        float pesoPerro = sc.nextFloat();
        sc.nextLine();

        System.out.print("Lugar de entrenamiento: ");
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
        System.out.println("\n Ingrese los datos del gato");

        System.out.print("Nombre: ");
        String nombreGato = sc.nextLine();

        System.out.print("Raza: ");
        String razaGato = sc.nextLine();

        System.out.print("Fecha de nacimiento: ");
        String fechaGato = sc.nextLine();

        System.out.print("Peso (en libras): ");
        float pesoGato = sc.nextFloat();

        System.out.print("Altura de salto: ");
        double salto = sc.nextDouble();

        Gato gato = new Gato(
                nombreGato,
                razaGato,
                "Gato",
                fechaGato,
                pesoGato,
                salto
        );

        // Resultados
        System.out.println("\n========== RESULTADOS ==========");

        perro.mostrarDatos();
        perro.comer();
        perro.comunicarse();

        gato.mostrarDatos();
        gato.comer();
        gato.comunicarse();

        sc.close();
    }
}