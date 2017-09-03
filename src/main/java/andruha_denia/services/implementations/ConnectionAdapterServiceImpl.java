package andruha_denia.services.implementations;

import andruha_denia.models.entities.ConnectionAdapter;
import andruha_denia.repositories.ConnectionAdapterRepository;
import andruha_denia.services.interfaces.ConnectionAdapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class ConnectionAdapterServiceImpl implements ConnectionAdapterService{
    private ConnectionAdapterRepository connectionAdapterRepository;

    @Autowired
    public void setConnectionAdapterRepository(ConnectionAdapterRepository connectionAdapterRepository) {
        this.connectionAdapterRepository = connectionAdapterRepository;
    }

    @Override
    public List<ConnectionAdapter> getAllConnectionAdapter() {
        return connectionAdapterRepository.findAll();
    }

    @Override
    public ConnectionAdapter getConnectionAdapter(Long id) {
        return connectionAdapterRepository.findOne(id);
    }

    @Override
    public void addConnectionAdapter(ConnectionAdapter connectionAdapter) {
        connectionAdapterRepository.save(connectionAdapter);
    }

    @Override
    public void editConnectionAdapter(ConnectionAdapter connectionAdapter) {
        connectionAdapterRepository.saveAndFlush(connectionAdapter);
    }

    @Override
    public void deleteConnectionAdapter(Long id) {
        connectionAdapterRepository.delete(id);
    }
}
