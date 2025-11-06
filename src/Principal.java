import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDelasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        // Pelicula otraPelicula = new Pelicula();
        // otraPelicula.nombre = "Matrix";
        // otraPelicula.fechaDeLanzamiento = 1999;
        // otraPelicula.duracionEnMinutos = 180;

        // otraPelicula.muestraFichaTecnica();

    }
}