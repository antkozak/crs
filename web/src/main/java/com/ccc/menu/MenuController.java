package com.ccc.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Juergen Hoeller
 */
@Controller
@RequestMapping("VIEW")
public class MenuController {

    @RequestMapping
    public String showMenu() {
        return "menu";
    }

}
