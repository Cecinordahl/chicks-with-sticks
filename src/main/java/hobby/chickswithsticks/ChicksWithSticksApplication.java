package hobby.chickswithsticks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ChicksWithSticksApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChicksWithSticksApplication.class, args);
    }
    @GetMapping("/index")
    public String frontPage(){
        return "index";
    }
}
