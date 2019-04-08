import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author tapakkur
 * @ProjectName hello-spring-boot
 * @Date 2019/4/7 12:19
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.tapakkur.demo_springboot"})
public class ApplicationRun implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(ApplicationRun.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class,args);
    }

    public void run(String... args) throws Exception {
        logger.info("The service has been started ...");
    }
}
