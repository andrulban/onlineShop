package andruha_denia;

import andruha_denia.services.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author azozello
 * @since 10.09.2017
 * TODO: Logging
 */
@SpringBootApplication
public class DataBaseApplication {
	private static BatteryService batteryService;
	private static ConnectionAdapterService connectionAdapterService;
	private static DriveService driveService;
	private static GpuService gpuService;
	private static LaptopService laptopService;
	private static OutputService outputService;
	private static ProcessorService processorService;
	private static RamService ramService;
	private static ScreenService screenService;

	@Autowired
	public void setBatteryService(BatteryService batteryService) {
		this.batteryService = batteryService;
	}
	@Autowired
	public void setConnectionAdapterService(ConnectionAdapterService connectionAdapterService) {
		this.connectionAdapterService = connectionAdapterService;
	}
	@Autowired
	public void setDriveService(DriveService driveService) {
		this.driveService = driveService;
	}
	@Autowired
	public void setGpuService(GpuService gpuService) {
		this.gpuService = gpuService;
	}
	@Autowired
	public void setLaptopService(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	@Autowired
	public void setOutputService(OutputService outputService) {
		this.outputService = outputService;
	}
	@Autowired
	public void setProcessorService(ProcessorService processorService) {
		this.processorService = processorService;
	}
	@Autowired
	public void setRamService(RamService ramService) {
		this.ramService = ramService;
	}
	@Autowired
	public void setScreenService(ScreenService screenService) {
		this.screenService = screenService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
//		Laptop laptop = new Laptop();
//		laptop.setName("Apple A1466 MacBook Air 13(MQD32UA/A)");
//		laptop.setOs(OS.MACOS);
//		laptop.setManufacturer(Manufacturer.APPLE);
//		laptop.setColour(Colour.ALUMINIUM);
//		laptop.setWeight(1.35F);
//		laptop.setKeyBoardIlluminated(true);
//		laptop.setRamSlotsAmount(0);
//		laptop.setAdvancedInfo("------");
//		laptop.setWidth(325);
//		laptop.setLength(227);
//		laptop.setHeight(17);
//		laptop.setKit("Ноутбук MacBook Air\n" +
//				"Адаптер питания\n" +
//				"Штепсельная вилка\n" +
//				"Руководство пользователя\n" +
//				"Подробнее: https://rozetka.com.ua/apple_mqd32ua_a/p17929266/#tab=characteristics");
//		laptop.setGranteeMonth(12);
//
//		laptop.setProcessor(processorService.getProcessor(1L));
//		laptop.setScreen(screenService.getScreen(1L));
//		laptop.setRam(ramService.getRam(1L));
//		laptop.setBattery(batteryService.getBattery(1L));
//
//		laptop.setDrive(new HashSet<>(driveService.getAllDrive()));
//		laptop.setGpu(new HashSet<>(gpuService.getAllGpu()));
//		laptop.setConnectionAdapter(new HashSet<>(connectionAdapterService.getAllConnectionAdapter()));
//		laptop.setOutputs(new HashSet<>(outputService.getAllOutput()));
//
//		laptopService.add(laptop);








//		Processor processor = new Processor();
//		processor.setCoresAmount(2);
//		processor.setName("Intel Core i5");
//		processor.setMinGHertz(1.8F);
//		processor.setMaxGHertz(2.9F);
//		processorService.addProcessor(processor);
//		Screen screen  = new Screen();
//		screen.setDiagonal(13.3F);
//		screen.setResolution("1440x900");
//		screen.setScreenType(ScreenType.GLOSSY);
//		screen.setResolutionType(ResolutionType.Wgxa);
//		screenService.addScreen(screen);
//		Ram ram = new Ram();
//		ram.setMegaHertz(1600);
//		ram.setSize(8);
//		ram.setRamType(RamType.LPDDR3);
//		ramService.addRam(ram);
//		Drive drive = new Drive();
//		drive.setDriveType(DriveType.SSD);
//		drive.setSize(128);
//		driveService.addDrive(drive);
//		Battery battery = new Battery();
//		battery.setBatteryType(BatteryType.UNPORTABLE);
//		battery.setDescription("Встроенный литиевый аккумулятор с полимерным электролитом емкостью 54 Вт*ч\n"+
//				"До 12 часов работы с включенным беспроводным доступом в Интернет\n" +
//				"До 12 часов работы при воспроизведении фильмов в iTunes\n" +
//				"До 30 дней работы в режиме ожидания\n");
//		batteryService.addBattery(battery);
//		ConnectionAdapter connectionAdapter = new ConnectionAdapter();
//		connectionAdapter.setConnectionAdapterType(ConnectionAdapterType.WIFI);
//		connectionAdapter.setVersion(802.11F);
//		connectionAdapterService.addConnectionAdapter(connectionAdapter);
//		ConnectionAdapter connectionAdapter1 = new ConnectionAdapter();
//		connectionAdapter1.setVersion(4.0F);
//		connectionAdapter1.setConnectionAdapterType(ConnectionAdapterType.BLUETOTH);
//		connectionAdapterService.addConnectionAdapter(connectionAdapter1);
//		Output output = new Output();
//		output.setOutPutType(OutPutType.THUNDERBOLT2);
//		outputService.addOutput(output);
//		Output output1 = new Output();
//		output1.setOutPutType(OutPutType.USB2);
//		outputService.addOutput(output1);
//		Output output2 = new Output();
//		output2.setOutPutType(OutPutType.MAGSAVE2);
//		outputService.addOutput(output2);
//		Gpu gpu = new Gpu();
//		gpu.setGpuType(GpuType.Integrated);
//		gpu.setRamAmount(2);
//		gpu.setName("Intel HD Graphics 6000");
//		gpuService.addGpu(gpu);
	}
}
