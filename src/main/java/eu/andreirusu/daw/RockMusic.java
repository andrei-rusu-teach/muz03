package eu.andreirusu.daw;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	public String getSong() {
		return "Musica ROCK ...";
	}
}
