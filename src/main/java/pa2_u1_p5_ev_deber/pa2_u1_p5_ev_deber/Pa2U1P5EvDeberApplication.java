package pa2_u1_p5_ev_deber.pa2_u1_p5_ev_deber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5EvDeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primer cambio en el main");
		System.out.println("Un poderosisimo cambio en la segunda rama");
	}
}
