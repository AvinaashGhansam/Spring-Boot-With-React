package com.springbootreact.webapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Telling spring to manage this
public class LoginController {
    // Spring will take care of creating the instance using constructor injection
    private AuthenticationService authenticationService;

    // Make sure Authentication Service is a spring bean so spring can find it
    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }
    // Get Logs
    /* private Logger logger = LoggerFactory.getLogger(getClass()); */

    // http://localhost:8082/login?name=Avinaash
    /**
     * The question mark in the URL is a called Queray Parameter
     * 
     * @param name name of the individual logging in. The request goes to the login
     *             controller. You tell the loginJsp a name is being passed by using
     *             the @RequestParam with the type
     *             and variable name
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET) // will support only GET request
    public String loginJsp(/* @RequestParam String name, ModelMap model */) {
        /**
         * To pass information from your controller to your JSP you have to use a Model
         */
        /*
         * model.put("name", name);*
         * /**
         * Go to JSP and add the model
         */
        /* logger.info("Request param is {}", name); */
        // System.out.println("Request param is " + name); // NOT RECOMMENDED in
        // Production Grade Application
        return "login";

    }

    @RequestMapping(value = "login", method = RequestMethod.POST) // will support only GET request
    public String routeToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        // Remember to route things to different page you have to do a ModelMap

        model.put("name", name);
        model.put("password", password);

        // Hard coded auth
        if (authenticationService.authenticate(name, password)) {
            return "welcome";
        }

        // if auth fails
        model.put("errorMessage", "Invalid username or password");
        return "login";

    }

}
