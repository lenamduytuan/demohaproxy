package duamuoi.spring.demohaproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@SpringBootApplication
@RestController
public class DemohaproxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemohaproxyApplication.class, args);
	}

	@RequestMapping("/")
	public ResponseEntity<String> home() throws Exception {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("IP Address:- " + inetAddress.getHostAddress() + " Host Name:- " + inetAddress.getHostName());
		return ResponseEntity.status(HttpStatus.OK).body("Hello Haproxy Container " + inetAddress.getHostAddress() + " | Host: " + inetAddress.getHostName());
	}

}
