package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Screen;
import andruha_denia.services.interfaces.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class ScreenControllerRest {

    private ScreenService screenService;

    @Autowired
    public void setScreenService(ScreenService screenService) {
        this.screenService = screenService;
    }

    @GetMapping(value = "/db/screens")
    public List<Screen> getAll() {
        return screenService.getAllScreen();
    }

    @GetMapping("/db/screens/{id}")
    public Screen get(@PathVariable long id){
        return screenService.getScreen(id);
    }

    @PostMapping(value = "/db/screens")
    public void add(@RequestBody Screen screen){
        screenService.addScreen(screen);
    }

    @PutMapping(value = "/db/screens/{id}")
    public void edit(@PathVariable long id, @RequestBody Screen screen){
        screen.setId(id);
        screenService.editScreen(screen);
    }

    @DeleteMapping(value = "/db/screens/{id}")
    public void delete(@PathVariable long id){
        screenService.deleteScreen(id);
    }

}
