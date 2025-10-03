package Halo.unsc.Halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
@ResponseBody
public class HaloApplication {
    public static void main(String[] args) {
		SpringApplication.run(HaloApplication.class, args);
	}
    @GetMapping("/hola")
    public String hola(@RequestParam(value = "nombre",defaultValue = "Mundo") String nombre){
        return String.format("Hola %s!", nombre);
    }
}

