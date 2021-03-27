package fr.esiea.ex4A;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ApiController {

    @PostMapping(path="/api/inscription",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
        System.out.println(userInfo);
        //TimeUnit.SECONDS.sleep(2L);

    }



    @GetMapping(path="/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Titi> matches(@RequestParam(name="userName") String name, @RequestParam(name="userCountry") String country){
        return List.of(
            new Titi("etienne","roche"),
            new Titi("marion","bretagne")
        );
    }


}
