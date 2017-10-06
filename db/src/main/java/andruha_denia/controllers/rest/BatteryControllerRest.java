package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Battery;
import andruha_denia.services.interfaces.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 13.09.17.
 */

@RestController
public class BatteryControllerRest {

    private BatteryService batteryService;

    @Autowired
    public void setBatteryService(BatteryService batteryService) {
        this.batteryService = batteryService;
    }

    @GetMapping(value = "/db/batteries")
    public List<Battery> getAll() {
        return batteryService.getAllBattery();
    }

    @GetMapping("/db/batteries/{id}")
    public Battery get(@PathVariable long id){
        return batteryService.getBattery(id);
    }

    @PostMapping(value = "/db/batteries/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Battery battery){
        batteryService.addBattery(battery);
    }

    @PutMapping(value = "/db/batteries/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void edit(@PathVariable long id, @RequestBody Battery battery){
        battery.setId(id);
        batteryService.editBattery(battery);
    }

    @DeleteMapping(value = "/db/batteries/{id}")
    public void delete(@PathVariable long id){
        batteryService.deleteBattery(id);
    }
}
