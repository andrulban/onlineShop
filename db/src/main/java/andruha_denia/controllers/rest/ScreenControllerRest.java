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

    @RequestMapping(value = "/db/screen/getAll", method = RequestMethod.GET)
    public List<Screen> getAll() {
        return screenService.getAllScreen();
    }

    @RequestMapping("/db/screen/get/{id}")
    public Screen get(@PathVariable long id){
        return screenService.getScreen(id);
    }

    @RequestMapping(value = "/db/screen/add", method = RequestMethod.POST)
    public void add(@RequestBody Screen screen){
        screenService.addScreen(screen);
    }

    @RequestMapping(value = "/db/screen/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Screen screen){
        screenService.editScreen(screen);
    }

    @RequestMapping(value = "/db/screen/delete/{id}")
    public void delete(@PathVariable long id){
        screenService.deleteScreen(id);
    }

    @Autowired
    public void setScreenService(ScreenService screenService) {
        this.screenService = screenService;
    }
}
