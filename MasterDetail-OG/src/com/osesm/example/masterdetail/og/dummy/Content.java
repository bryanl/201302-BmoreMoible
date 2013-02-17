package com.osesm.example.masterdetail.og.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Content {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Article> ITEMS = new ArrayList<Article>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Article> ITEM_MAP = new HashMap<String, Article>();

	static {
		// Add 3 sample items.
		addItem(new Article(
				"That Darn Katz!",
				"No. We're on the top. Wow, you got that off the Internet? "
						+ "In my day, the Internet was only used to download pornography. "
						+ "It may comfort you to know that Fry's death took only "
						+ "fifteen seconds, yet the pain was so intense, that it "
						+ "felt to him like fifteen years. And it goes without saying, "
						+ "it caused him to empty his bowels. For example, if you "
						+ "killed your grandfather, you'd cease to exist!"));
		addItem(new Article(
				"Love and Rocket",
				"<p>It must be wonderful. Well, thanks to the Internet, I'm now "
						+ "bored with sex. Is there a place on the web that panders "
						+ "to my lust for violence? Eeeee! Now say 'nuclear wessels'! "
						+ "Okay, it's 500 dollars, you have no choice of carrier, the "
						+ "battery can't hold the charge and the reception isn't very... "
						+ "A sexy mistake. Anyone who laughs is a communist!</p>"
						+ "<ul><li>Fry! Quit doing the right thing, you jerk!</li>"
						+ "<li>You mean while I'm sleeping in it?</li>"
						+ "<li>Interesting. No, wait, the other thing: tedious.</li></ul>"));
		addItem(new Article(
				"A Bicyclops Built For Two",
				"The key to victory is discipline, and that means a well made "
						+ "bed. You will practice until you can make your bed in "
						+ "your sleep. Son, as your lawyer, I declare y'all are in "
						+ "a 12-piece bucket o' trouble. But I done struck you a deal: "
						+ "Five hours of community service cleanin' up that ol' mess you "
						+ "caused. Ask her how her day was. Son, as your lawyer, I declare "
						+ "y'all are in a 12-piece bucket o' trouble. But I done struck "
						+ "you a deal: Five hours of community service cleanin' up that "
						+ "ol' mess you caused."));
	}

	private static void addItem(Article item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Article {
		public String id;

		public String content;

		public Article(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
