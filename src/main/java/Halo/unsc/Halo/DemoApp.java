package Halo.unsc.Halo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//LA DEMO DE CAMBIAR NOMBRE
@SpringBootApplication
@Controller
@ResponseBody
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(HaloApplication.class, args);
    }
    /*@GetMapping("/hola")
public String hola(@RequestParam(name = "nombre",defaultValue = "Mundo") String nam){
    return String.format("Hola %s!", nam);
}*/
    @PostMapping("/hola")
    public String hola(@RequestParam(name = "nombre",defaultValue = "Mundo")String nam) {
        return String.format("Hola %s!", nam + "Soy el post");
    }
}
