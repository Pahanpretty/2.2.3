package web.controller;

import dao.CarsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cars {

    private final CarsDAO carsDAO;
    @Autowired
    public Cars(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }


    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carsDAO.getCars());
        return "cars/getCars";
    }

    @GetMapping(value = "/cars/?count={count}")
    public String printCountCars(@PathVariable("count") int count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            messages.add("ALISKA === PIPISKA!");
        }
        model.addAttribute("messages", messages);
        return "cars";


    }
}
