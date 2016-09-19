package Service;

import org.springframework.stereotype.Service;

/**
 * Created by Bing on 9/19/16.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
