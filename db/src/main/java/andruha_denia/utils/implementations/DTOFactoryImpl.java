package andruha_denia.utils.implementations;

import andruha_denia.utils.interfaces.DTOConvertible;
import andruha_denia.utils.interfaces.DTOFactory;
import core.cross_service.dto.entity.DTO;
import org.springframework.stereotype.Service;

/**
 * @author azozello
 * @since 04.10.17.
 */

@Service
public class DTOFactoryImpl implements DTOFactory {

    @Override
    public DTO entityToDTO(DTOConvertible entity) {
        return null;
    }
}
