package com.ccc;

import com.ccc.api.service.LibraryService;
import java.util.HashMap;
import java.util.Map;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.portlet.mvc.AbstractController;

/**
 * //TODO class description
 * <p/>
 * Date: 1/9/12
 *
 * @author Nikita Levyankov
 */
@RequestMapping("VIEW")
@Controller(value="libraryController")
public class LibraryController{

    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @RenderMapping(value="NORMAL")
    public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) throws Exception {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("folders", libraryService.getFolders());
        return new ModelAndView("library", model);
    }

    @ResourceMapping
    public void viewAsText(ResourceResponse response) {
        response.setContentType("application/json");
    }
}
