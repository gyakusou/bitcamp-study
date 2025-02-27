// 세션 다루기 - 세션의 값을 무효화시키는 방법
package bitcamp.app2;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/c03_3")

// 세션에 보관된 값 중에서 현재 페이지 컨트롤러에서 사용할 값을 지정한다.
// 또한 세션에 보관할 값이기도 하다.
@SessionAttributes({"name", "name2"})
public class Controller03_3 {

  // 테스트:
  // http://.../app2/c03_3/h1
  @GetMapping(value = "h1", produces = "text/plain;charset=UTF-8")
  @ResponseBody
  public String handler1(HttpSession session) {
    return String.format("name=%s, age=%s, name2=%s, age2=%s", session.getAttribute("name"),
        session.getAttribute("age"), session.getAttribute("name2"), session.getAttribute("age2"));
  }

  // 테스트:
  // http://.../app2/c03_3/h2
  @GetMapping(value = "h2", produces = "text/plain;charset=UTF-8")
  @ResponseBody
  public String handler2(HttpSession session) {
    // 세션을 완전히 무효화시키기
    session.invalidate();
    // 용도:
    // => 페이지 컨트롤러에 상관없이 모든 세션 값을 삭제할 때 사용하라.
    // 세션 자체를 무효화시켜 다음에 요청이 들어 왔을 때 새로 세션을 만들게 한다.
    //
    return "session.invalidate()";
  }

  // 테스트:
  // http://.../app2/c03_3/h3
  @GetMapping(value = "h3", produces = "text/plain;charset=UTF-8")
  @ResponseBody
  public String handler3(SessionStatus status) {
    // 현재 페이지 컨트롤러의 @SessionAttributes 에 지정된 값만 무효화시키기
    status.setComplete();
    // 용도:
    // => 현재 페이지 컨트롤러가 작업하면서 세션에 데이터를 보관했고,
    // 현제 페이지 컨트롤러가 보관한 데이터만 삭제하고 싶다면 이 방식으로 처리하라.
    // => 즉, 세션을 그대로 유지한채로 이 페이지 컨트롤러에서
    // @SessionAttributes로 지정한 값만 무효화 시킬 때 사용한다.
    return "status.setComplete()";
  }


}


