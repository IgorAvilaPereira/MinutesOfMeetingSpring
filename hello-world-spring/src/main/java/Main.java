

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("controllers.")
public class Main {
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);                
    }
      /*
    @GetMapping("/produtos/hello")  
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
  
    //  example of mustache template. Mustache templates files must be in src/main/resources/templates
    @GetMapping("/teste")
    public ModelAndView teste(Map<String, Object> model) {
        model.put("mensagem", "ola");
        return new ModelAndView("teste", model);
    }   */
}
