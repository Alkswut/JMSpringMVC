package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Car;
import web.service.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    Service service = new Service();

    @GetMapping(value="/cars")
    public String printCars(HttpServletRequest request, Model model){
        String str = request.getParameter("count");
        if (str == null) {
            List<Car> cars = Service.getCars(5);
            model.addAttribute("cars", cars);
        } else {
            List<Car> cars = Service.getCars(Integer.parseInt(str));
            model.addAttribute("cars", cars);
        }
        return "cars";
    }
}


