package divyanshu.dsa.snakeandladder;

import divyanshu.dsa.snakeandladder.systemDesign.PlayGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeandladderApplication {

	public static void main(String[] args) {
		PlayGame pg = new PlayGame();
		pg.starter();
		SpringApplication.run(SnakeandladderApplication.class, args);
	}

}
