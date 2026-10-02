<<<<<<< Updated upstream
package com.office.samplepjt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${server.name}")
    private String serverName;

    @GetMapping({"", "/"})
    public String home() {
        System.out.println("home()");

        System.out.println("serverName: " + serverName);

        return "home";
    }
}
=======
package com.office.samplepjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/"})
    public String home() {
        System.out.println("home()");

        String nextPage = "home";

        return nextPage;
    }
}
>>>>>>> Stashed changes
