package miracle.com.springbootproject.controllers;

import miracle.com.springbootproject.model.Fruit;
import miracle.com.springbootproject.service.FruitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitController {

    private final FruitService fruitService;

    FruitController(FruitService fruitService){
        this.fruitService = fruitService;
    }

    @GetMapping("/fruits")
    ResponseEntity<List<Fruit>> getFruits(){
        return new ResponseEntity<>(fruitService.getAllFruits(), HttpStatus.OK);
    }


    @PostMapping("/fruit")
    ResponseEntity<Fruit> addFruit(Fruit fruit){
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }

}
