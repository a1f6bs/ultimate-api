package pl.coderslab.theultimateapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.theultimateapi.service.MatchService;

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping(path= "/get-matches")
    @ResponseBody
    public String sample() {
        return matchService.getMatches().toString();
    }
}
