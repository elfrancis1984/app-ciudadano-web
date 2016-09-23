package ec.gob.mdt.ciudadano.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RestFilter implements Filter {

	public static final String LOGIN_HEDER = "s_header_params";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			try {
				if (!((HttpServletRequest) request).isRequestedSessionIdValid()) {
					HttpServletRequest httpServletRequest = (HttpServletRequest) request;
					String loginParams = httpServletRequest.getHeader(LOGIN_HEDER);
					String user = loginParams.split(";;")[0];
					String pass = loginParams.split(";;")[1];
					((HttpServletRequest) request).login(user, pass);
				}
				chain.doFilter(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				if (response instanceof HttpServletResponse) {
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				}
			}
		}
	}

	@Override
	public void destroy() {

	}

}
