package andruha_denia.utils.interfaces;

import core.cross_service.dto.entity.DTO;

/**
 * @author azozello
 * @since 04.10.17.
 */

public interface DTOFactory {

    DTO entityToDTO(DTOConvertible entity);
}
