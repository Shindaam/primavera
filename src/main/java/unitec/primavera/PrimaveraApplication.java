package unitec.primavera;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner {
    @Autowired RepositorioPagos repoPagos; //inyeccion de dependencias
    @Autowired RepositorioMensaje repoMensa;
    int x;

	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
	}

    @Override
    public void run(String... args) throws Exception {
        x=2;
        System.out.println("Hola Mundo");
        repoPagos.servicioPagar();
        //guarda un mensaje
        //repoMensa.save(new Mensajito("malo","ya felpo esto",LocalDate.now()));
        //Buscamos todos los mensajes
       // for(Mensajito mensa: repoMensa.findAll()){
        //    System.out.println(mensa);
        //}
        //Buscamos por id
        //System.out.println(repoMensa.findById("5bb420f8d979c30b0c5606ce").get());
        //Buscamos por titulo
        repoMensa.save(new Mensajito("malo","yo","topoyiya",LocalDate.now()));
        System.out.println(repoMensa.findByTitulo("yo"));
                
                
       
    }
}
