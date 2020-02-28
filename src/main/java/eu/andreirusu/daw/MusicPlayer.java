package eu.andreirusu.daw;

public class MusicPlayer {
	private Music music;
	
	// Aici de fapt am un exemplu de IoC
	public MusicPlayer (Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println(music.getSong());
	}

}
