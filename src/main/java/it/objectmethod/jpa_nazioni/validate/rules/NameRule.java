package it.objectmethod.jpa_nazioni.validate.rules;

import org.springframework.stereotype.Component;

@Component
public class NameRule {

	public String validateName(String name) {
		if (name.equals("")) {
			return "Il nome e obbligatorio";
		} else if (name.length() < 3) {
			return "Il nome deve essere lungo almeno 3 caratteri";
		} else {
			return "";
		}

	}
}
