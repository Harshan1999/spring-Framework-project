import com.Harsha.service.SpeakerService;
import com.Harsha.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService service=new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean(SpeakerService.class);
        System.out.println(service.findAll().get(0).getLastName());
    }
}
