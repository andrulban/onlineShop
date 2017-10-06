package core.cross_service.dto.entity;

import java.util.*;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class LaptopDTO extends DTO {

    private int ramSlotsAmount;

    private float weight;

    private boolean isKeyBoardIlluminated;

    private int granteeMonth;

    private int length;

    private int width;

    private int height;

    private DTO processor;

    private DTO screen;

    private DTO ram;

    private DTO battery;

    private Set<DTO> drive;

    private Set<DTO> gpu;

    private Set<DTO> connectionAdapter;

    private Set<DTO> outputs;

    public LaptopDTO() {
        drive = new HashSet<>();
        gpu = new HashSet<>();
        connectionAdapter = new HashSet<>();
        outputs = new HashSet<>();

        processor = new DTO();
        screen = new DTO();
        ram = new DTO();
        battery = new DTO();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LaptopDTO laptopDTO = (LaptopDTO) o;

        if (ramSlotsAmount != laptopDTO.ramSlotsAmount) return false;
        if (Float.compare(laptopDTO.weight, weight) != 0) return false;
        if (isKeyBoardIlluminated != laptopDTO.isKeyBoardIlluminated) return false;
        if (granteeMonth != laptopDTO.granteeMonth) return false;
        if (length != laptopDTO.length) return false;
        if (width != laptopDTO.width) return false;
        if (height != laptopDTO.height) return false;
        if (!processor.equals(laptopDTO.processor)) return false;
        if (!screen.equals(laptopDTO.screen)) return false;
        if (!ram.equals(laptopDTO.ram)) return false;
        if (!battery.equals(laptopDTO.battery)) return false;
        if (!drive.equals(laptopDTO.drive)) return false;
        if (!gpu.equals(laptopDTO.gpu)) return false;
        if (!connectionAdapter.equals(laptopDTO.connectionAdapter)) return false;

        return outputs.equals(laptopDTO.outputs);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ramSlotsAmount;
        result = 31 * result + granteeMonth;
        return result;
    }

    public int getRamSlotsAmount() {
        return ramSlotsAmount;
    }

    public void setRamSlotsAmount(int ramSlotsAmount) {
        this.ramSlotsAmount = ramSlotsAmount;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isKeyBoardIlluminated() {
        return isKeyBoardIlluminated;
    }

    public void setKeyBoardIlluminated(boolean keyBoardIlluminated) {
        isKeyBoardIlluminated = keyBoardIlluminated;
    }

    public int getGranteeMonth() {
        return granteeMonth;
    }

    public void setGranteeMonth(int granteeMonth) {
        this.granteeMonth = granteeMonth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public DTO getProcessor() {
        return processor;
    }

    public void setProcessor(DTO processor) {
        this.processor = processor;
    }

    public DTO getScreen() {
        return screen;
    }

    public void setScreen(DTO screen) {
        this.screen = screen;
    }

    public DTO getRam() {
        return ram;
    }

    public void setRam(DTO ram) {
        this.ram = ram;
    }

    public DTO getBattery() {
        return battery;
    }

    public void setBattery(DTO battery) {
        this.battery = battery;
    }

    public Set<DTO> getDrive() {
        return drive;
    }

    public void setDrive(Set<DTO> drive) {
        this.drive = drive;
    }

    public Set<DTO> getGpu() {
        return gpu;
    }

    public void setGpu(Set<DTO> gpu) {
        this.gpu = gpu;
    }

    public Set<DTO> getConnectionAdapter() {
        return connectionAdapter;
    }

    public void setConnectionAdapter(Set<DTO> connectionAdapter) {
        this.connectionAdapter = connectionAdapter;
    }

    public Set<DTO> getOutputs() {
        return outputs;
    }

    public void setOutputs(Set<DTO> outputs) {
        this.outputs = outputs;
    }
}
