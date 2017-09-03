package andruha_denia.services.implementations;

import andruha_denia.models.entities.Gpu;
import andruha_denia.repositories.GpuRepository;
import andruha_denia.services.interfaces.GpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class GpuServiceImpl implements GpuService{
    private GpuRepository gpuRepository;

    @Autowired
    public void setGpuRepository(GpuRepository gpuRepository) {
        this.gpuRepository = gpuRepository;
    }

    @Override
    public List<Gpu> getAllGpu() {
        return gpuRepository.findAll();
    }

    @Override
    public Gpu getGpu(Long id) {
        return gpuRepository.findOne(id);
    }

    @Override
    public void addGpu(Gpu gpu) {
        gpuRepository.save(gpu);
    }

    @Override
    public void editGpu(Gpu gpu) {
        gpuRepository.saveAndFlush(gpu);
    }

    @Override
    public void deleteGpu(Long id) {
        gpuRepository.delete(id);
    }
}
