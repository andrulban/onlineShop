package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Battery;
import andruha_denia.services.interfaces.BatteryService;
import core.cross_service.dto.entity.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<DTO> getAll() {
        List<DTO> converted = new ArrayList<>();
        batteryService.getAllBattery().forEach(v -> converted.add(v.convert()));
        return converted;
    }

    @GetMapping("/db/batteries/{id}")
    public DTO get(@PathVariable long id){
        return batteryService.getBattery(id).convert();
    }

    @PostMapping(value = "/db/batteries", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody DTO dto){
        batteryService.addBattery(Battery.revert(dto));
    }

    @PutMapping(value = "/db/batteries/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void edit(@PathVariable long id, @RequestBody DTO dto){
        Battery battery = Battery.revert(dto);
        battery.setId(id);
        batteryService.editBattery(battery);
    }

    @DeleteMapping(value = "/db/batteries/{id}")
    public void delete(@PathVariable long id){
        batteryService.deleteBattery(id);
    }
}
