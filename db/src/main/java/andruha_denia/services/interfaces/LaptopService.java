package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Laptop;

import java.util.List;

/**
 * @author andrusha
 * @since 03.09.17.
 * TODO: Rename method (add -> addLaptop)
 */
public interface LaptopService {
    List<Laptop> getAllLaptop();
    Laptop getLaptop(Long id);
    void add(Laptop laptop);
    void edit(Laptop laptop);
    void deleteLaptop(Long id);
}
