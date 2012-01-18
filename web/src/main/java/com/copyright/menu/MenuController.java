package com.copyright.menu;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.util.PortalUtil;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
public class MenuController {

    @RequestMapping
    public String showMenu(RenderRequest req, RenderResponse res, final ModelMap model) throws PortalException,
        SystemException {
        model.addAttribute("rootUrl", PortalUtil.getHomeURL(PortalUtil.getHttpServletRequest(req)));
        return "menu";
    }

}
