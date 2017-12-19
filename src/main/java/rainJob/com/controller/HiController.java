package rainJob.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/cs")
public class HiController {

    @RequestMapping(value = "/", method = GET)
    public @ResponseBody String home() {
        return "ssssssssssssssssss";
    }

}