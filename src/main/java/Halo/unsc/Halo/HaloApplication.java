package Halo.unsc.Halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ResponseBody
//EL MAIN PRINCIPAL
public class HaloApplication {
    public static void main(String[] args) {
		SpringApplication.run(HaloApplication.class, args);
	}
}


