package com.namish.demo.Portfolio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myportfolio {

    @GetMapping("/myself")
    public String myself(){
        return """
                <h1>Namish Sharma</h1>
                <p>A good human being<p>
                """;
    }

    @GetMapping("/skills")
    public String skills(){
        return """
                <h1>SKILLs</h1>
                <ul>
                <li>github link: https://github.com/NamishSharma44</li>
                </ul>
                """;
    }

    @GetMapping("/edu")
    public String edu(){
        return "LASEC, Jhalawar(RAJ)";
    }
    @GetMapping("/project")
    public String project(){
        return """
                <h1>Project</h1>
                <ul>Prescripto</ul>
                <ul>Stock market Analyzer</ul>
        """;
    }
}
