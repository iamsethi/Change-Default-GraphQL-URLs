package com.example.resolver;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.response.EmployeeResponse;

@Service
public class EmployeeResponseResolver implements GraphQLResolver<EmployeeResponse> {

    public List<String> getTeamName(EmployeeResponse employeeResponse) {
        System.out.println("Calling GraphQL Query Resolver");
        List<String> teamName = new ArrayList<>();

        switch (String.valueOf(employeeResponse.getId())) {
            case "80992798":
                teamName.add("DPS");
                teamName.add("R360");
                teamName.add("Telemetry");
                break;
            case "80982074":
                teamName.add("DPS");
                teamName.add("R360");
                teamName.add("Automation");
                break;
        }
        return teamName;
    }


}
    
