package com.example.query;

import org.springframework.stereotype.Component;
import com.example.response.EmployeeResponse;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Org implements GraphQLQueryResolver {

    public Integer orgId() {
        return 18892798;
    }

    public String orgName() {
        return "Pepsico";
    }
	
    public EmployeeResponse getEmployee(int id) {
        return new EmployeeResponse(id);
    }
}
