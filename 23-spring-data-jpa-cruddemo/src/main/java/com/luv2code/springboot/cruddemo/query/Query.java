package com.luv2code.springboot.cruddemo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String firstQuery(){
        return "First Query";
    }

}
