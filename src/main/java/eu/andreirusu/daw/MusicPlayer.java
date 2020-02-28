package eu.andreirusu.daw;

public class MusicPlayer {
	ClassicalMusic music;
	
	public MusicPlayer (ClassicalMusic music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println(music.getSong());
	}

}
