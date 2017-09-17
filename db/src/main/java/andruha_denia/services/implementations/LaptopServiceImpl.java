package andruha_denia.services.implementations;

import andruha_denia.models.entities.Laptop;
import andruha_denia.repositories.LaptopRepository;
import andruha_denia.services.interfaces.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author andrusha
 * @since 03.09.17.
 */
@Service
public class LaptopServiceImpl implements LaptopService {
    private LaptopRepository laptopRepository;

    @Autowired
    public void setLaptopRepository(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public List<Laptop> getAllLaptop() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop getLaptop(Long id) {
        return laptopRepository.findOne(id);
    }

    @Override
    public void add(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    @Override
    public void edit(Laptop laptop) {
        laptopRepository.saveAndFlush(laptop);
    }

    @Override
    public void deleteLaptop(Long id) {
        laptopRepository.delete(id);
    }
}
