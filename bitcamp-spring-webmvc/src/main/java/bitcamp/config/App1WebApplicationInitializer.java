package bitcamp.config;

import java.io.File;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// app1 라는 디스패처 서블릿을 등록한다.

public class App1WebApplicationInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {

  String uploadTmpDir;

  public App1WebApplicationInitializer() {
    uploadTmpDir = new File(System.getProperty("java.io.tmpdir")).getAbsolutePath();
    System.out.println("업로드 임시 폴더: " + uploadTmpDir);
  }

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  @Override // 디스패처 서블릿이 갖고 있는 ioc 컨테이너 설정정보를 담고 있다. 이 클래스로 가서 어떤 객체를 생성하고 싶은지 적어라
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {App1Config.class};
  }

  @Override // 디스패처 서블릿이 어떤 요청을 하는지
  protected String[] getServletMappings() {
    return new String[] {"/app1/*"};
  }

  @Override // 디스패처 서블릿의 이름은
  protected String getServletName() {
    return "app1";
  }


  // @Override
  // protected void customizeRegistration(//
  // javax.servlet.ServletRegistration.Dynamic registration) {
  // // Servlet 3.0 API의 파일 업로드를 사용하려면 다음과 같이
  // // DispatcherServlet에 설정을 추가해야 한다.
  // // => 즉, 멀티파트 데이터를 Part 객체로 받을 때는
  // // 이 설정을 추가해야 한다.
  // // => 단, 이 설정을 추가하면 Spring WebMVC의 MultipartResolver가 작동되지 않는다.★
  // //
  // // 만약 Spring의 방식으로 파일 업로드를 처리하고 싶다면,
  // // AppConfig.java의 MultipartResolver를 추가해야 한다.!★
  // // => 즉, 멀티파트 데이터를 MultipartFile 객체로 받을 때는
  // // 이 설정으로 처리할 수 없다.
  // // => AppConfig에 별도로 MulitpartResolver를 추가해야 한다.
  // //
  // // DispatcherServlet 이 multipart/form-data 으로 전송된 데이터를 처리하려면
  // // 해당 콤포넌트를 등록해야 한다.
  // registration.setMultipartConfig(new MultipartConfigElement(uploadTmpDir, // 업로드 한 파일을 임시 보관할 위치
  // 10000000, // 최대 업로드할 수 있는 파일들의 총 크기
  // 15000000, // 요청 전체 데이터의 크기
  // 2000000 // 업로드 되고 있는 파일을 메모리에 임시 임시 보관하는 크기
  // ));
  // }

}


