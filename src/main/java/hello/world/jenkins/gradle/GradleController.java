package hello.world.jenkins.gradle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GradleController {
    
    @GetMapping("/gradle")
    public String gradle() {
        return "hello jenkins gradle";
    }
}
