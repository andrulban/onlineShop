package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Gpu;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface GpuService {
    List<Gpu> getAllGpu();
    Gpu getGpu(Long id);
    void addGpu(Gpu gpu);
    void editGpu(Gpu gpu);
    void deleteGpu(Long id);
}
