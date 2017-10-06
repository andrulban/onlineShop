package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Laptop;
import andruha_denia.services.interfaces.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class LaptopControllerRest {

    private LaptopService laptopService;

    @Autowired
    public void setLaptopService(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping(value = "/db/laptops")
    public List<Laptop> getAll() {
        return laptopService.getAllLaptop();
    }

    @GetMapping("/db/laptops/{id}")
    public Laptop get(@PathVariable long id){
        return laptopService.getLaptop(id);
    }

    @PostMapping(value = "/db/laptops")
    public void add(@RequestBody Laptop laptop){
        laptopService.add(laptop);
    }

    @PutMapping(value = "/db/laptops/{id}")
    public void edit(@PathVariable long id, @RequestBody Laptop laptop){
        laptop.setId(id);
        laptopService.edit(laptop);
    }

    @DeleteMapping(value = "/db/laptops/{id}")
    public void delete(@PathVariable long id){
        laptopService.deleteLaptop(id);
    }

}
