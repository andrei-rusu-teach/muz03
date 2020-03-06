package eu.andreirusu.daw;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	public String getSong() {
		return "Musica clasica ...";
	}
}
