package pl.coderslab.theultimateapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.theultimateapi.service.TeamService;

@Controller
@RequestMapping("/init")
public class InitialController {

    @Autowired
    TeamService teamService;

    @GetMapping("/addTeams")
    @ResponseBody
    public String addTeams () {
        teamService.addTeamToDb("Grandmaster Flash Warszawa", 16.0, 1);
        teamService.addTeamToDb("KWR Knury Kamieniec Wrocławski", 15.0, 2);
        teamService.addTeamToDb("muJAHedini dysku Warszawa", 14.0, 3);
        teamService.addTeamToDb("KS AZS AWF Flow Wrocław", 13.0, 4);
        teamService.addTeamToDb("Zawierucha Warszawa", 12.0, 5);
        teamService.addTeamToDb("RJP Warszawa", 11.0, 6);
        teamService.addTeamToDb("KS BC Kosmodysk Warszawa", 10.0, 7);
        teamService.addTeamToDb("Kato Vice Katowice", 9.0, 8);
        teamService.addTeamToDb("4hands Warszawa", 8.0, 9);
        teamService.addTeamToDb("KrakUF Kraków", 7.0, 10);
        teamService.addTeamToDb("Uwaga Pies Poznań", 6.0, 11);
        teamService.addTeamToDb("KS Nine Hills Chełmno", 5.0, 12);
        teamService.addTeamToDb("Frisbnik Rybnik", 4.0, 13);
        teamService.addTeamToDb("Brave Beavers Dopiewo", 3.0, 14);
        teamService.addTeamToDb("Ultimatum Gdańsk", 2.0, 15);
        teamService.addTeamToDb("Mad Hatters MOSiR Płock", 1.0, 16);
        return "Teams added";
    }
}