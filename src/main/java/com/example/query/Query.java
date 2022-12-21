package com.example.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	public String getFirstName () {
		return "Ketan";
	}
	
	public String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
