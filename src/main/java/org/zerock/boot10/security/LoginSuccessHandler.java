package org.zerock.boot10.security;

import lombok.extern.java.Log;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Log
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
        Object dest = request.getSession().getAttribute("dest");
        String nextURL = null;

        if(dest != null) {
            request.getSession().removeAttribute("dest");
            nextURL = (String) dest;
        } else {
            nextURL = super.determineTargetUrl(request, response);
        }
        log.info("==================== " + nextURL + " ====================");
        return nextURL;
    }
}
