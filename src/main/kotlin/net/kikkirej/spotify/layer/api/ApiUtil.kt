package net.kikkirej.spotify.layer.api

import org.springframework.web.context.request.NativeWebRequest

import javax.servlet.http.HttpServletResponse
import java.io.IOException

object ApiUtil {
    fun setExampleResponse(req: NativeWebRequest, contentType: String, example: String) {
        try {
            req.getNativeResponse(HttpServletResponse::class.java)?.apply {
                setCharacterEncoding("UTF-8")
                addHeader("Content-Type", contentType)
                getWriter().print(example)
            }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}
