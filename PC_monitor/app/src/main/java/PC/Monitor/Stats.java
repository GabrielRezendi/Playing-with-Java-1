package PC.Monitor;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.concurrent.Callable;
import com.sun.management.OperatingSystemMXBean;
import picocli.CommandLine.Command;

@Command(name = "Stats", version = "PC Monitor 1.0")

public class Stats implements Callable<Integer> {

    Log log = new Log();

    @Command(name = "ram")
    public Integer Ram(){
        log.info("User asked for Ram stats");
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        double totalMemorySize = operatingSystemMXBean.getTotalMemorySize() / Math.pow(1024, 3);
        double usedMemorySize = (operatingSystemMXBean.getTotalMemorySize() - operatingSystemMXBean.getFreeMemorySize()) / Math.pow(1024, 3);
        System.out.println("Total memory: " + totalMemorySize + " GB");
        System.out.println("Used memory: " + usedMemorySize + " GB");
        
        return 0;
    }

    @Command (name = "hd")
    public Integer HD(){
        log.info("User asked for HD stats");
        double totalDiskSize = new File("/").getTotalSpace() / Math.pow(1024, 3);
        double usedDiskSize = new File("/").getTotalSpace() - new File("/").getFreeSpace() / Math.pow(1024, 3);
        System.out.println("Total disk space: " + totalDiskSize + " GB");
        System.out.println("Used disk space: " + usedDiskSize + " GB");
        return 0;
    }

    @Command(name = "cpu")
    public Integer CPU() {
        log.info("User asked for CPU stats");
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        double cpuLoad = operatingSystemMXBean.getCpuLoad();
        System.out.println("CPU Load: " + cpuLoad);
        return 0;
    }

    @Command(name = "email")
    public Integer Email(){
        try{
            Alert.sendEmail();
            log.info("User sent an email");
        }catch (Exception e){
            log.error("User failed to send an email");    
        } 
        return 0;
    }    

    public Integer call() throws Exception {
        return 0;
    }
}