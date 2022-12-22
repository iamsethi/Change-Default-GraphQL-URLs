package com.example.query;

import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

    public Integer orgId() {
        return 18892798;
    }

    public String orgName() {
        return "Pepsico";
    }
	
}
