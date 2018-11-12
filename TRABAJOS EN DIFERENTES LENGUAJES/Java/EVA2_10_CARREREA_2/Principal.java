//@author Roberto Valdez Vazquez-18550731

public class JavaApplication {
    public static void main(String[] args) {

        boolean servicio;

        boolean residencias;

        boolean materias;
        
        servicio = true;

        residencias = true;

        materias = true;
        if (servicio == true && residencias == true && materias == true) {
            System.out.println("Te puedes Titular");
        } else {
            System.out.println("No te puedes Titular");
        }
    }
}
