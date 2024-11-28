package dev.mvc.gittest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCont {
  public HomeCont() {
    System.out.println("-> HomeCnont created.");
  }
  
  // http://localhost:9091
  // http://localhost:9091/index.do
  @GetMapping(value={"/", "/index.do"}) 
  public String home() {
    return "index";  // /templates/index.html
  }
  
}
