package Halo.unsc.Halo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapeosHolaHalo {
    @RequestMapping("/holaNombres")
    @ResponseBody
    public String holaMundo(@RequestParam(name = "nombre",required = false,defaultValue="mundo") String nombre){
       // if(nombre == null || nombre.isBlank()){
       //     return "Hola el Mundo de Halo";
        //}
         return "Hola "+ nombre;
    }
}
