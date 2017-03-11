package Three;

import java.util.ArrayList;

public class GameDBController {
	private static ArrayList<Game> games = new ArrayList<Game>();
        
	public static void addGame(Game game) 
        {
		games.add(game);
	}

	public static ArrayList<Game> getGames(String categorie) {
		ArrayList<Game>subGames = new ArrayList<Game>();
		for (int i = 0; i < games.size(); i++)
			if (games.get(i).getCategorie().equals(categorie))
				subGames.add(games.get(i));
		return subGames;
	}

}
