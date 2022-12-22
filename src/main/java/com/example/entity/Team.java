package com.example.entity;

import java.util.List;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Team {

    private int teamId;
    private String teamName;

	public Team(int teamId,String teamName){
        this.teamId = teamId;
        this.teamName = teamName;

    }
}