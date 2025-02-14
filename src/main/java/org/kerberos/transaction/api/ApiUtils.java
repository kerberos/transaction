package org.kerberos.transaction.api;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.IOException;

public class ApiUtils {
    public static void setResponse(NativeWebRequest req, String contentType, String strContent) {
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(strContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
