package com.example.response;


import java.util.ArrayList;
import java.util.List;

import com.example.entity.Team;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponse {

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private List<Team> teamName;

    private Team team;



    public EmployeeResponse(int id) {
        this.teamName = new ArrayList<Team>();
        switch (id) {
            case 80992798:
                this.id = 80992798;
                this.firstName = "Ketan";
                this.lastName = "Sethi";
                this.email = "ketan.sethi@pepsico.com";
                System.out.println("--------Getting from DB--------");
                teamName.add(new Team(123,"R360"));
                teamName.add(new Team(456,"Telemetry"));
                break;
            case 80982074:
                this.id = 80982074;
                this.firstName = "Aditya";
                this.lastName = "Jain";
                this.email = "aditya.jain@pepsico.com";
                System.out.println("--------Getting from DB--------");
                teamName.add(new Team(789,"R360"));
                teamName.add(new Team(012,"Automation"));
                break;
        }


    }

}
