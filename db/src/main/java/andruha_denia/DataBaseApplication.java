package andruha_denia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author azozello
 * @since 10.09.2017
 *
 * TODO: Make keystore
 * TODO: Tests
 * TODO: Logging (see TestControllerRest & LoggingAspect)
 * TODO: Comments code convention
 * TODO: API documentation (Javadoc)
 * TODO: Add csrf
 */
@SpringBootApplication
public class DataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}
}
