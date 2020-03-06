package eu.andreirusu.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	private Music music;
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("25")
	private int volume;
	
	@Autowired
	@Qualifier("rockMusic")
	public void setMusic(Music music) {
		this.music = music;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String playMusic() {
		return music.getSong();
	}

}
