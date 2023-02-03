package com.springbootreact.webapplication.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * In order for this to work ..@RequestMapping, make sure you tell
 * Spring that this is a controller
 */

@Controller
public class HelloWorldController {
    @RequestMapping("hello-world") // http://localhost:8082/hello-world
    @ResponseBody // It will return whatever is return from the message. Will be sent as is to the
                  // browser
    public String greeting() {
        return "Hello World";
    }

    @RequestMapping("hello-world-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> HTML Title Page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("HTML BODY");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();

    }

    // Java Server Pages (JSP)
    // A JSP file must be created // Look in resource // folder >> META-INF >>
    // A dependency must be added in the pom.xml
    /**
     * <dependency>
     * <groupId>org.apache.tomcat.embed</groupId>
     * <artifactId>tomcat-embed-jasper</artifactId>
     * <scope>provided</scope>
     * </dependency>
     * 
     * @return
     */
    @RequestMapping("helloworld-jsp")
    public String helloJSP() {
        // /home/ec2-user/Desktop/Spring-Boot-With-React/src/main/resources/META-INF/resources/WEB-INF/jsp/helloworld.jsp
        return "helloworld"; // must patch the .jsp file name

    }
    // TODO: lesson 85

}
