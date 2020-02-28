package eu.andreirusu.daw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Music music = context.getBean("musicBean",RockMusic.class);
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		
		context.close();
	}

}
