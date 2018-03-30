package nicebank;

        import org.springframework.stereotype.Component;

@Component
public class World {
    private String greeting = "hi!!!";
    public String sayHi(){
        return greeting;
    }
}
