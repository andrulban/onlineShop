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

    @Autowired
    public void setConnectionAdapterService(ConnectionAdapterService connectionAdapterService) {
        this.connectionAdapterService = connectionAdapterService;
    }

    @GetMapping(value = "/db/connection_adapters")
    public List<ConnectionAdapter> getAll() {
        return connectionAdapterService.getAllConnectionAdapter();
    }

    @GetMapping("/db/connection_adapters/{id}")
    public ConnectionAdapter get(@PathVariable long id) {
        return connectionAdapterService.getConnectionAdapter(id);
    }

    @PostMapping(value = "/db/connection_adapters")
    public void add(@RequestBody ConnectionAdapter connectionAdapter) {
        connectionAdapterService.addConnectionAdapter(connectionAdapter);
    }

    @PutMapping(value = "/db/connection_adapters/{id}")
    public void edit(@PathVariable long id, @RequestBody ConnectionAdapter connectionAdapter) {
        connectionAdapter.setId(id);
        connectionAdapterService.editConnectionAdapter(connectionAdapter);
    }

    @DeleteMapping(value = "/db/connection_adapters/{id}")
    public void delete(@PathVariable long id) {
        connectionAdapterService.deleteConnectionAdapter(id);
    }

}
