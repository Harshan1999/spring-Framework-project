import com.Harsha.respository.HibernateSpeakerRepositoryImpl;
import com.Harsha.respository.SpeakerRepository;
import com.Harsha.service.SpeakerService;
import com.Harsha.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.Harsha"})
public class AppConfig {
//    @Bean(name="speakerService")
//    public SpeakerService getSpeakerService()
//    {
//        SpeakerServiceImpl service =new SpeakerServiceImpl();
//        service.setRepository(getSpeakerRepository());
//        return service;
//    }
//    @Bean(name="speakerRepository")
//    public SpeakerRepository getSpeakerRepository()
//    {
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
