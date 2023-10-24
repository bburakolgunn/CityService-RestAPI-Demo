package RestAPI.demo.controller;

import RestAPI.demo.entity.Sehir;
import RestAPI.demo.service.SehirService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/sehirler")
public class sehirController {

    private final SehirService sehirService;





    @GetMapping
    public ResponseEntity<List<Sehir>> getSehirler(@RequestParam(required = false) String name){

        return new ResponseEntity<>(sehirService.getSehirler(name), HttpStatus.OK);

    }
    
    @GetMapping("/{id}")
        public ResponseEntity<Sehir> getSehir(@PathVariable String id){
                return  new ResponseEntity<>(getSehirById(id),HttpStatus.OK);

        }



        @PostMapping
        public ResponseEntity<Sehir> createSehir(@RequestBody Sehir newSehir){
        return new ResponseEntity<>(sehirService.createSehir(newSehir),HttpStatus.CREATED);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deteleSehir(@PathVariable String id){
               sehirService.deteleSehir(id);
                return new ResponseEntity<>(HttpStatus.OK);
        }

    @PutMapping("/{id}")
    public  ResponseEntity<Void> getSehir(@PathVariable String id,@RequestBody Sehir newSehir){

        sehirService.updateSehir(id,newSehir);

        return  new ResponseEntity<>(HttpStatus.OK);
    }

    private Sehir getSehirById(String id){
       return sehirService.getSehirById(id);



    }


    }




