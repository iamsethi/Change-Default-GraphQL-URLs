package com.example.resolver;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.entity.Team;
import com.example.enums.TeamNameFilter;
import com.example.response.EmployeeResponse;

@Service
public class EmployeeResponseResolver implements GraphQLResolver<EmployeeResponse> {

    public List<Team> getTeamName(EmployeeResponse employeeResponse, TeamNameFilter teamNameFilter) {
        System.out.println("Calling GraphQL Query Resolver");
        List<Team> teamName = new ArrayList<Team>();
        List<Team> filteredTeamName = new ArrayList<Team>();

        switch (String.valueOf(employeeResponse.getId())) {
            case "80992798":
                teamName.add(new Team(123,"R360"));
                teamName.add(new Team(456,"Telemetry"));
            break;
            case "80982074":
                teamName.add(new Team(789,"R360"));
                teamName.add(new Team(012,"Automation"));
            break;
        }
        for(Team team : teamName){
            if(teamNameFilter != null && teamNameFilter.name().equalsIgnoreCase(team.getTeamName().toString())){
                filteredTeamName.add(new Team(team.getTeamId(),team.getTeamName()));
                return filteredTeamName;
            }
            else return teamName;
         
        }
        return filteredTeamName;
       
    }


}
    
