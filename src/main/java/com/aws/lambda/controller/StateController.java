package com.aws.lambda.controller;

import com.aws.lambda.dto.State;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StateController {

	@RequestMapping(path = "/states", method = RequestMethod.GET)
	public List<State> getStates() {
		return buildStates();
	}

	public List<State> buildStates () {
		List<State> states = new ArrayList<>();
		states.add(new State("AL", "Alabama"));
		states.add(new State("AK", "Alaska"));
		states.add(new State("AZ", "Arizona"));
		states.add(new State("AR", "Arkansas"));
		states.add(new State("CA", "California"));
		states.add(new State("CO", "Colorado"));
		states.add(new State("CT", "Connecticut"));
		states.add(new State("DE", "Delaware"));
		states.add(new State("DC", "District Of Columbia"));
		states.add(new State("FL", "Florida"));
		states.add(new State("GA", "Georgia"));
		states.add(new State("HI", "Hawaii"));
		states.add(new State("ID", "Idaho"));
		states.add(new State("IL", "Illinois"));
		states.add(new State("IN", "Indiana"));
		states.add(new State("IA", "Iowa"));
		states.add(new State("KS", "Kansas"));
		states.add(new State("KY", "Kentucky"));
		states.add(new State("LA", "Louisiana"));
		states.add(new State("ME", "Maine"));
		states.add(new State("MD", "Maryland"));
		states.add(new State("MA", "Massachusetts"));
		states.add(new State("MI", "Michigan"));
		states.add(new State("MN", "Minnesota"));
		states.add(new State("MS", "Mississippi"));
		states.add(new State("MO", "Missouri"));
		states.add(new State("MT", "Montana"));
		states.add(new State("NE", "Nebraska"));
		states.add(new State("NV", "Nevada"));
		states.add(new State("NH", "New Hampshire"));
		states.add(new State("NJ", "New Jersey"));
		states.add(new State("NM", "New Mexico"));
		states.add(new State("NY", "New York"));
		states.add(new State("NC", "North Carolina"));
		states.add(new State("ND", "North Dakota"));
		states.add(new State("OH", "Ohio"));
		states.add(new State("OK", "Oklahoma"));
		states.add(new State("OR", "Oregon"));
		states.add(new State("PA", "Pennsylvania"));
		states.add(new State("RI", "Rhode Island"));
		states.add(new State("SC", "South Carolina"));
		states.add(new State("SD", "South Dakota"));
		states.add(new State("TN", "Tennessee"));
		states.add(new State("TX", "Texas"));
		states.add(new State("UT", "Utah"));
		states.add(new State("VT", "Vermont"));
		states.add(new State("VA", "Virginia"));
		states.add(new State("WA", "Washington"));
		states.add(new State("WV", "West Virginia"));
		states.add(new State("WI", "Wisconsin"));
		states.add(new State("WY", "Wyoming"));
		states.add(new State("AB", "Alberta"));
		states.add(new State("BC", "British Columbia"));
		states.add(new State("MB", "Manitoba"));
		states.add(new State("NB", "New Brunswick"));
		states.add(new State("NL", "Newfoundland and Labrador"));
		states.add(new State("NS", "Nova Scotia"));
		states.add(new State("NT", "Northwest Territories"));
		states.add(new State("NU", "Nunavut"));
		states.add(new State("ON", "Ontario"));
		states.add(new State("PE", "Prince Edward Island"));
		states.add(new State("QC", "Quebec"));
		states.add(new State("SK", "Saskatchewan"));
		states.add(new State("YT", "Yukon"));

		return states;
	}

}
