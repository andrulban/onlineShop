package andruha_denia.controllers.rest;

import andruha_denia.models.entities.ConnectionAdapter;
import andruha_denia.services.interfaces.ConnectionAdapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class ConnectionAdapterControllerRest {
    private ConnectionAdapterService connectionAdapterService;

    @RequestMapping(value = "/db/ca/getAll", method = RequestMethod.GET)
    public List<ConnectionAdapter> getAll() {
        return connectionAdapterService.getAllConnectionAdapter();
    }

    @RequestMapping("/db/ca/get/{id}")
    public ConnectionAdapter get(@PathVariable long id){
        return connectionAdapterService.getConnectionAdapter(id);
    }

    @RequestMapping(value = "/db/ca/add", method = RequestMethod.POST)
    public void add(@RequestBody ConnectionAdapter connectionAdapter){
        connectionAdapterService.addConnectionAdapter(connectionAdapter);
    }

    @RequestMapping(value = "/db/ca/edit", method = RequestMethod.POST)
    public void edit(@RequestBody ConnectionAdapter connectionAdapter){
        connectionAdapterService.editConnectionAdapter(connectionAdapter);
    }

    @RequestMapping(value = "/db/ca/delete/{id}")
    public void delete(@PathVariable long id){
        connectionAdapterService.deleteConnectionAdapter(id);
    }

    @Autowired
    public void setConnectionAdapterService(ConnectionAdapterService connectionAdapterService) {
        this.connectionAdapterService = connectionAdapterService;
    }
}
