package com.copyright.ajax;

import com.copyright.domain.SimpleObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;

import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * Simple portlets AJAX controller
 * <p/>
 * Date: 1/16/12
 *
 * @author Yury_Baltrushevich
 */
@Controller(value = "ajaxController")
@RequestMapping(value = "VIEW")
public class AjaxController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RenderMapping
    public ModelAndView helloWorld(RenderRequest req, RenderResponse res) throws Exception {

        logger.info("************** Returning hello view with ");

        ModelAndView mav = new ModelAndView("ajax_view");
        mav.addObject("helloWorldMessage", "Hello World");

        ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
        mav.addObject("themeDisplay", themeDisplay);

        return mav;
    }

    @ResourceMapping("ajaxTest")
    public String getWidgetsAsJson(ResourceRequest request, ResourceResponse response, final ModelMap model) throws IOException {
        SimpleObject so = new SimpleObject();
        so.setAddress("Address1");
        so.setName("Gans");
        so.setPhone("+3752911111111");

        model.addAttribute("objects", so);
        return "jsonView";
    }

}
