package com.ccc;

import java.util.HashMap;
import java.util.Map;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.Controller;

/**
 * //TODO class description
 * <p/>
 * Date: 1/9/12
 *
 * @author Nikita Levyankov
 */
public class HWController implements Controller {

    public void handleActionRequest(ActionRequest request, ActionResponse response) throws Exception {
    }

    public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) throws Exception {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("helloWorldMessage", "Hello World");
        return new ModelAndView("test", model);
    }
}
