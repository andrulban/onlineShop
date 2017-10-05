package andruha_denia.models.entities;

import andruha_denia.models.enums.Colour;
import andruha_denia.models.enums.Manufacturer;
import andruha_denia.models.enums.OS;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;
import core.cross_service.dto.entity.LaptopDTO;

import javax.persistence.*;
import java.util.Set;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Laptop implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private int ramSlotsAmount;

    @Column
    private float weight;

    @Column(name = "illumination")
    private boolean isKeyBoardIlluminated;

    @Column
    private int granteeMonth;

    @Column
    private int length;

    @Column
    private int width;

    @Column
    private int height;

    @Column
    private String kit;

    @Column
    private String advancedInfo;

    @Enumerated(EnumType.STRING)
    private OS os;

    @Enumerated(EnumType.STRING)
    private Colour colour;

    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "processor_id", referencedColumnName = "id")
    private Processor processor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "screen_id", referencedColumnName = "id")
    private Screen screen;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ram_id", referencedColumnName = "id")
    private Ram ram;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "battery_id", referencedColumnName = "id")
    private Battery battery;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "laptop__drive", joinColumns = @JoinColumn(name = "laptop_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "drive_id", referencedColumnName = "id"))
    private Set<Drive> drive;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "laptop__gpu", joinColumns = @JoinColumn(name = "laptop_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "gpu_id", referencedColumnName = "id"))
    private Set<Gpu> gpu;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "laptop__connection_adapter", joinColumns = @JoinColumn(name = "laptop_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "connection_adapter_id", referencedColumnName = "id"))
    private Set<ConnectionAdapter> connectionAdapter;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "laptop__output", joinColumns = @JoinColumn(name = "laptop_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "output_id", referencedColumnName = "id"))
    private Set<Output> outputs;

    @Override
    public DTO convert() {
        return new LaptopDTO();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getAdvancedInfo() {
        return advancedInfo;
    }

    public void setAdvancedInfo(String advancedInfo) {
        this.advancedInfo = advancedInfo;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Set<Drive> getDrive() {
        return drive;
    }

    public void setDrive(Set<Drive> drive) {
        this.drive = drive;
    }

    public Set<Gpu> getGpu() {
        return gpu;
    }

    public void setGpu(Set<Gpu> gpu) {
        this.gpu = gpu;
    }

    public Set<ConnectionAdapter> getConnectionAdapter() {
        return connectionAdapter;
    }

    public void setConnectionAdapter(Set<ConnectionAdapter> connectionAdapter) {
        this.connectionAdapter = connectionAdapter;
    }

    public Set<Output> getOutputs() {
        return outputs;
    }

    public void setOutputs(Set<Output> outputs) {
        this.outputs = outputs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
