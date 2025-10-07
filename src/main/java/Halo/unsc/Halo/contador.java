package Halo.unsc.Halo;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

//UN CONTADOR PARA RECARGAR LA PAGINA
@RestController
public class contador {
    static AtomicInteger contador = new AtomicInteger(0);
    @GetMapping("/Contador")
    public String contador(){
        return contador.getAndIncrement()+" ";
}

}
