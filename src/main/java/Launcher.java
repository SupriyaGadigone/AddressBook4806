import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}

