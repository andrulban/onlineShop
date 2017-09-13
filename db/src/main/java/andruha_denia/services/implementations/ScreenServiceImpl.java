package andruha_denia.services.implementations;

import andruha_denia.models.entities.Screen;
import andruha_denia.repositories.ScreenRepository;
import andruha_denia.services.interfaces.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class ScreenServiceImpl implements ScreenService{
    private ScreenRepository screenRepository;

    @Autowired
    public void setScreenRepository(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    @Override
    public List<Screen> getAllScreen() {
        return screenRepository.findAll();
    }

    @Override
    public Screen getScreen(Long id) {
        return screenRepository.findOne(id);
    }

    @Override
    public void addScreen(Screen screen) {
        screenRepository.save(screen);
    }

    @Override
    public void editScreen(Screen screen) {
        screenRepository.saveAndFlush(screen);
    }

    @Override
    public void deleteScreen(Long id) {
        screenRepository.delete(id);
    }
}
