package oauth2rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String index() {
        return "/";
    }

    @GetMapping("/secure")
    public String secure() {
        Object result = restTemplate.getForObject("https://esi.evetech.net/latest/alliances", Object.class);
        System.out.println(result);
        return "/";
    }
}
