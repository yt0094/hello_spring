package hello.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
* @Controller : HTTP의 Request를 내부로 연결해 주는 역할
* */
@Controller
public class HelloController {
    /*
    * @GetMapping: HTML Get Request URL에 대한 처리
    * Get방식으로 요청시 URL:http://기본주소/경로(요청서비스)
    * */
    @GetMapping("hello")
    /*
    * Model: 스프일 프레임워크에서 컨트롤러 뷰(View)로 데이터를 전달하기 위한 엔터페이스
    * */
    public String hello(Model model) {
        model.addAttribute("data", "홍길동씨!");
        // recources/templates/[리턴값].html
        return "hello";
    }
    @GetMapping("hello2")
    public String hello2(Model model) {
        model.addAttribute("data", "유희정씨!");

        return "hello2";
    }
    /*
    *  쿼리 스트링 예제:http://<호스트>:<포트>/<경로>?<쿼리 스트링>&<쿼리 스트링>...
    *  쿼리스트링:[속성]=[값]
    *  @RequestParam: HTTP Get 요청의 파라메터 중 일치하는 쿼리스트링의 값을 연결해준다.
    *  http://localhost:8080/hello-param?name=홍길동
    *  URL의 경로중 두단어 이상으로 경로를 만들시 snake방식을 사용하지만 '_' ,대신 "-"을 사용한다.
    * */
    @GetMapping("hello-param")
    public String helloParam(@RequestParam("name")String name, Model model) {
        model.addAttribute("name",name);
        return "hello-param";
    }
}


