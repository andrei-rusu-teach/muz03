package eu.andreirusu.daw;

public class MusicPlayer {
	private Music music;
	
	private String name;
	private int volume;
	
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

	public void setMusic(Music music) {
		this.music = music;
	}

	// Aici de fapt am un exemplu de IoC
//	public MusicPlayer (Music music) {
//		this.music = music;
//	}

	
	
	public void playMusic() {
		System.out.println(music.getSong());
	}

}
