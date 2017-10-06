package andruha_denia.online_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author azozello
 * @since 22.09.2017
 * lines 17-19 must be changed before th release (develop-only)
 * TODO: Make Pages Work Again
 */
@SpringBootApplication
public class UiApplication {

	public static void main(String[] args) {
		HttpsURLConnection.setDefaultHostnameVerifier ((hostname, session) -> true);
		System.setProperty("javax.net.ssl.trustStore","/Users/andrusha/Programming/IdeaProjects/1_onlineShop/keystore.p12");
		System.setProperty("javax.net.ssl.trustStorePassword","w2a6c8wvk");
		SpringApplication.run(UiApplication.class, args);
	}
}
