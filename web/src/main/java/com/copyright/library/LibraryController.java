package com.copyright.library;

import com.copyright.api.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * //TODO class description
 * <p/>
 * Date: 1/9/12
 *
 * @author Nikita Levyankov
 */
@Controller
@RequestMapping("VIEW")
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @RequestMapping
    public String listFolders(Model model) {
        model.addAttribute("folders", this.libraryService.getFolders());
        return "library";
    }

}
