package rainJob.com.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/cs")
public class HiController {

    @RequestMapping(value = "/", method = GET)
    public @ResponseBody String home()
    {
        System.err.println(System.getProperty("userdir"));
        return "ssssssssssssssssss";
    }

}