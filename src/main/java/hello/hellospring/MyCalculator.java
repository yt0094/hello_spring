//package hello.hellospring;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class MyCalculator {
//    @GetMapping("calculator")
//    public String calculator(@RequestParam("num1")int num1, @RequestParam("num2")int num2, Model model) {
//     int sum = num1+num2;
//        model.addAttribute("result", "두 수의 덧셈은 "+sum);
//        System.out.println("두 수의 덧셈은 "+sum);
//        return "calculator";
//    }
//}
//

package hello.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyCalculator {
    @GetMapping("calculator")
    public String calculator(@RequestParam("num1")int num1, @RequestParam("num2")int num2, @RequestParam("num3") int num3, Model model) {
        int sum = (num1+num2)*num3;
        model.addAttribute("result", "두 수의 덧셈후 곱하기는  "+sum);
        System.out.println("두 수의 덧셈후 곱하기는 "+sum);
        return "calculator";
    }
}

