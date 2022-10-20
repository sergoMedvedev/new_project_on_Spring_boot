package com.SpringBoot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //обращается в файлу application context  и перености данные в апликатион контекст
        Music music = context.getBean("musicBean", Music.class);

        System.out.println(music.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }

}
