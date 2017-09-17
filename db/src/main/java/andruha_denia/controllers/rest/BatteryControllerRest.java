package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Battery;
import andruha_denia.services.interfaces.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/db/battery/getAll", method = RequestMethod.GET)
    public List<Battery> getAll() {
        return batteryService.getAllBattery();
    }

    @RequestMapping("/db/battery/get/{id}")
    public Battery get(@PathVariable long id){
        return batteryService.getBattery(id);
    }

    @RequestMapping(value = "/db/battery/add", method = RequestMethod.POST)
    public void add(@RequestBody Battery battery){
        batteryService.addBattery(battery);
    }

    @RequestMapping(value = "/db/battery/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Battery battery){
        batteryService.editBattery(battery);
    }

    @RequestMapping(value = "/db/battery/delete/id", method = RequestMethod.POST)
    public void delete(@PathVariable long id){
        batteryService.deleteBattery(id);
    }
}
