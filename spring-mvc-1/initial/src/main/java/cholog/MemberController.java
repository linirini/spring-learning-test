package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @ModelAttribute
    @GetMapping("/hello")//렌더링할 파일 경로
    public String world(@RequestParam("name") String name, Model model) {
        // TODO: /hello 요청 시 resources/templates/hello.html 페이지가 응답할 수 있도록 설정하세요.
        // TODO: 쿼리 파라미터로 name 요청이 들어왔을 때 해당 값을 hello.html에서 사용할 수 있도록 하세요.
        model.addAttribute("name", name);
        return "hello";
        //반환되는 값의 이름을 가진 view가 존재하지 않는다면 경고를 발생시킨다.
        //이 메서드를 호출하는 클라이언트에게 어떤 뷰를 사용해야하는건지 명시해주기 위해 뷰 이름을 반환한다.
    }

    @ResponseBody
    @GetMapping("/json")
    public Person json() {
        // TODO: /json 요청 시 {"name": "brown", "age": 20} 데이터를 응답할 수 있도록 설정하세요.
        return new Person("brown", 20);
    }
}
