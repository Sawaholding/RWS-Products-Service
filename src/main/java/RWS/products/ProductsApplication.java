package RWS.products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ProductsApplication {


//	@RequestMapping("/")
//	public String home() {
//		return "Hello Docker World";
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);


	}


}
