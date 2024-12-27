package skillfactoryaction.sf4.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainClass {
    @GetMapping(path = "/")
    ResponseEntity<Map<String,String>> mainController(){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("message","It's a simple app!!");

        return ResponseEntity.status(HttpStatus.OK).body(stringMap);
    }

}
