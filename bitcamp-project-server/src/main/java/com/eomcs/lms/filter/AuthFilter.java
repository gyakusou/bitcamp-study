package com.eomcs.lms.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.lms.domain.Member;

// 조회만 가능

// @WebFilter("/*")
public class AuthFilter implements Filter {

  @Override
  public void doFilter( //
      ServletRequest request, //
      ServletResponse response, //
      FilterChain chain) //
      throws IOException, ServletException {

    HttpServletRequest httpRequest = (HttpServletRequest) request; // 타입캐스팅을 여러번 할 경우에는 지정해 놓는다.
    HttpServletResponse httpResponse = (HttpServletResponse) response; // 타입캐스팅을 여러번 할 경우에는 지정해 놓는다.

    String servletPath = httpRequest.getServletPath(); // 형변환(타입캐스팅 해서 써야한다.)
    System.out.println(servletPath);

    if (servletPath.endsWith("add") || //
        servletPath.endsWith("delete") || //
        servletPath.endsWith("update")) { //
      Member loginUser = (Member) httpRequest.getSession().getAttribute("loginUser");
      if (loginUser == null) {
        httpResponse.sendRedirect("../auth/login");
        return;
      }
    }
    chain.doFilter(request, response);
  }

}
