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

    @RequestMapping(value = "/db/laptop/getAll", method = RequestMethod.GET)
    public List<Laptop> getAll() {
        return laptopService.getAllLaptop();
    }

    @RequestMapping("/db/laptop/get/{id}")
    public Laptop get(@PathVariable long id){
        return laptopService.getLaptop(id);
    }

    @RequestMapping(value = "/db/laptop/add", method = RequestMethod.POST)
    public void add(@RequestBody Laptop laptop){
        laptopService.add(laptop);
    }

    @RequestMapping(value = "/db/laptop/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Laptop laptop){
        laptopService.edit(laptop);
    }

    @RequestMapping(value = "/db/laptop/delete/{id}")
    public void delete(@PathVariable long id){
        laptopService.deleteLaptop(id);
    }

    @Autowired
    public void setLaptopService(LaptopService laptopService) {
        this.laptopService = laptopService;
    }
}
