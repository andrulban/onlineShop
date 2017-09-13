package andruha_denia.services.interfaces;

import andruha_denia.models.entities.ConnectionAdapter;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface ConnectionAdapterService {
    List<ConnectionAdapter> getAllConnectionAdapter();
    ConnectionAdapter getConnectionAdapter(Long id);
    void addConnectionAdapter(ConnectionAdapter connectionAdapter);
    void editConnectionAdapter(ConnectionAdapter connectionAdapter);
    void deleteConnectionAdapter(Long id);
}
