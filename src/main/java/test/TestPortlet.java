package test;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * //TODO class description
 * <p/>
 * Date: 1/6/12
 *
 * @author Nikita Levyankov
 */
public class TestPortlet extends GenericPortlet {

    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, java.io.IOException {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        response.setContentType("text/html");
        response.getWriter().print("Hello World, " + themeDisplay.getTheme().getName());
    }
}
