package com.example.response;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponse {

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private List<String> teamName;



    public EmployeeResponse(int id) {
        this.teamName = new ArrayList<String>();
        switch (id) {
            case 80992798:
                this.id = 80992798;
                this.firstName = "Ketan";
                this.lastName = "Sethi";
                this.email = "ketan.sethi@pepsico.com";
                teamName.add("DPS");
                teamName.add("R360");
                teamName.add("Telemetry");
                break;
            case 80982074:
                this.id = 80982074;
                this.firstName = "Aditya";
                this.lastName = "Jain";
                this.email = "aditya.jain@pepsico.com";
                teamName.add("DPS");
                teamName.add("R360");
                teamName.add("Automation");
                break;
        }


    }

}
