package andruha_denia.repositories;

import andruha_denia.models.entities.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andrusha on 03.09.17.
 */
@Repository
public interface OutputRepository extends JpaRepository<Output, Long> {
}
