package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Screen;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface ScreenService {
    List<Screen> getAllScreen();
    Screen getScreen(Long id);
    void addScreen(Screen screen);
    void editScreen(Screen screen);
    void deleteScreen(Long id);
}
