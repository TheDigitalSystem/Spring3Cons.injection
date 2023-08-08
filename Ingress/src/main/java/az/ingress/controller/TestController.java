package az.ingress.controller;

import az.ingress.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
private final TestService testService;

@Autowired
//constructor based injection
// TestController controller = new TestController(new TestService());
    public TestController(TestService testService) {
        this.testService = testService;
    }
    public void testM(){
        testService.test();
    }



}
