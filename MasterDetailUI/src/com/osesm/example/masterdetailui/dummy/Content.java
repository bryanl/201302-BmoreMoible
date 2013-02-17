package com.osesm.example.masterdetailui.dummy;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Content {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Quote> ITEMS = new ArrayList<Quote>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Quote> ITEM_MAP = new HashMap<String, Quote>();

	static {
		// Add 3 sample items.

		String title1 = "Why Must I Be a Crustacean in Love?";
		String content1 = "<p>Incidentally, you have a dime up your nose. "
				+ "File not found. Bender?! You stole the atom. I've got "
				+ "to find a way to escape the horrible ravages of youth. "
				+ "Suddenly, I'm going to the bathroom like clockwork, every "
				+ "three hours. And those jerks at Social Security stopped "
				+ "sending me checks. Now 'I'' have to pay ''them'!</p>";
		String author1 = "Zoidberg";

		String title2 = "Lesser of Two Evils";
		String content2 = "<p>The alien mothership is in orbit here. If we can "
				+ "hit that bullseye, the rest of the dominoes will fall like "
				+ "a house of cards. Checkmate. I could if you hadn't turned "
				+ "on the light and shut off my stereo. No. We're on the top."
				+ "</p> <ul> <li>And until then, I can never die?</li> <li>Shut "
				+ "up and take my money!</li> <li>Daddy Bender, we're hungry.</li></ul>";
		String author2 = "Fry";

		String title3 = "Space Pilot 3000";
		String content3 = "You, a bobsleder!? That I'd like to see! Fry! Quit "
				+ "doing the right thing, you jerk! Yep, I remember. They came "
				+ "in last at the Olympics, then retired to promote alcoholic "
				+ "beverages! You guys go on without me! I'm going to go... "
				+ "look for more stuff to steal!";
		String author3 = "Leela";

		String title4 = "Attack of the Killer App";
		String content4 = "<p>Well I'da done better, but it's plum hard pleading "
				+ "a case while awaiting trial for that there incompetence. Morbo "
				+ "will now introduce tonight's candidates&hellip; PUNY HUMAN NUMBER "
				+ "ONE, PUNY HUMAN NUMBER TWO, and Morbo's good friend, Richard Nixon. "
				+ "I usually try to keep my sadness pent up inside where it can fester "
				+ "quietly as a mental illness. Um, is this the boring, peaceful kind "
				+ "of taking to the streets?</p>";
		String author4 = "Bender";

		String title5 = "Time Keeps on Slippin'";
		String content5 = "<p>I'm sure those windmills will keep them cool. Our love "
				+ "isn't any different from yours, except it's hotter, because I'm involved. "
				+ "That's a popular name today. Little \"e\", big \"B\"? Eeeee!  "
				+ "Now say \"nuclear wessels\"!</p><ul><li>Nay, I respect "
				+ "and admire Harold Zoid too much to beat him to "
				+ "death with his own Oscar.</li><li>Well, let's just dump "
				+ "it in the sewer and say we delivered it.</li><li>Ah, computer "
				+ "dating. It's like pimping, but you rarely have to use the phrase "
				+ "\"upside your head.\"</li></ul>";
		String author5 = "Professor";

		String title6 = "I Second That Emotion";
		String content6 = "<p>Or a guy who burns down a bar for the insurance money! "
				+ "Bender! Ship! Stop bickering or I'm going to come back there and change your "
				+ "opinions manually! Moving along&hellip; And why did 'I' have to take a cab? "
				+ "Why did you bring us here? Guess again.</p>";
		String author6 = "Amy";

		String title7 = "Where the Buggalo Roam";
		String content7 = "<p>Man, I'm sore all over. I feel like I just went ten rounds "
				+ "with mighty Thor. You guys go on without me! I'm going to go&hellip; "
				+ "look for more stuff to steal! Well, let's just dump it in the sewer "
				+ "and say we delivered it. Yes, except the Dave Matthews Band doesn't "
				+ "rock. No, of course not. It was&hellip; uh&hellip; porno. Yeah, "
				+ "that's it.</p><ol><li>Large bet on myself in round one.</li><li>No,"
				+ " of course not. It was&hellip; uh&hellip; porno. Yeah, that's it.</li></ol>";
		String author7 = "Hermes";

		String title8 = "The Birdbot of Ice-Catraz";
		String content8 = "Anyone who laughs is a communist! For example, if you "
				+ "killed your grandfather, you'd cease to exist! Ummm...to eBay? "
				+ "Yes, I saw. You were doing well, until everyone died.";
		String author8 = "Kif";

		String title9 = "Put Your Head on my Shoulder";
		String content9 = "<p>This is the worst kind of discrimination: the kind against "
				+ "me! We're rescuing ya. Ah, yes! John Quincy Adding Machine.  He struck "
				+ "a chord with the voters when he pledged not to go on a killing spree. I'm "
				+ "sorry, guys. I never meant to hurt you. Just to destroy everything you ever "
				+ "believed in. You wouldn't. Ask anyway!</p><ul><li>The key to victory is "
				+ "discipline, and that means a well made bed. You will practice until you can "
				+ "make your bed in your sleep.</li><li>There's no part of that sentence I "
				+ "didn't like!</li><li>Bender, being God isn't easy. If you do too much, "
				+ "people get dependent on you, and if you do nothing, they lose hope. You "
				+ "have to use a light touch. Like a safecracker, or a pickpocket.</li><li>"
				+ "We need rest.  The spirit is willing, but the flesh is spongy and bruised.</li></ul>";
		String author9 = "Brannigan";

		String title10 = "How Hermes Requisitioned His Groove Back";
		String content10 = "<p>And I'd do it again! And perhaps a third time! But that "
				+ "would be it. Yep, I remember. They came in last at the Olympics, "
				+ "then retired to promote alcoholic beverages! You're going back for "
				+ "the Countess, aren't you? Yep, I remember. They came in last at the "
				+ "Olympics, then retired to promote alcoholic beverages! Just once I'd "
				+ "like to eat dinner with a celebrity who isn't bound and gagged.</p>";
		String author10 = "Mom";

		String title11 = "A Tale of Two Santas";
		String content11 = "<p>But, like most politicians, he promised more than he "
				+ "could deliver. Come, Comrade Bender! We must take to the streets! "
				+ "Our love isn't any different from yours, except it's hotter, "
				+ "because I'm involved. Oh Leela! You're the only person I could turn "
				+ "to; you're the only person who ever loved me. Whoa a real live robot; "
				+ "or is that some kind of cheesy New Year's costume? I never loved you.</p>";
		String author11 = "Calculon";

		String title12 = "Spanish Fry";
		String content12 = "<p>Bender?! You stole the atom. No! The kind with looting and maybe "
				+ "starting a few fires! If rubbin' frozen dirt in your crotch is wrong, hey I "
				+ "don't wanna be right. Dear God, they'll be killed on our doorstep! And there's "
				+ "no trash pickup until January 3rd. Daddy Bender, we're hungry. Why not indeed!"
				+ "</p><ul><li>Alright, let's mafia things up a bit. Joey, burn down the ship. "
				+ "Clamps, burn down the crew.</li><li>Ow, my spirit!</li><li>Shut up and get to "
				+ "the point!</li><li>No! The kind with looting and maybe starting a few fires!</li></ul>";
		String author12 = "Leela";

		String title13 = "Anthology of Interest II";
		String content13 = "<p>You seem malnourished. Are you suffering from intestinal parasites? Look, everyone wants to be like Germany, but do we really have the pure strength of 'will'? I am the man with no name, Zapp Brannigan! Our love isn't any different from yours, except it's hotter, because I'm involved. I found what I need. And it's not friends, it's things. Yes, I saw. You were doing well, until everyone died.</p>";
		String author13 = "Fry";

		String title14 = "The Day The Earth Stood Stupid";
		String content14 = "<p>In our darkest hour, we can stand erect, with proud upthrust bosoms. I'll tell them you went down prying the wedding ring off his cold, dead finger. I don't want to be rescued. Bender, this is Fry's decision&hellip; and he made it wrong. So it's time for us to interfere in his life. Soothe us with sweet lies. We need rest.  The spirit is willing, but the flesh is spongy and bruised.</p>";
		String author14 = "Zoidberg";

		addItem(new Quote("1", title1, content1, author1));
		addItem(new Quote("2", title2, content2, author2));
		addItem(new Quote("3", title3, content3, author3));
		addItem(new Quote("4", title4, content4, author4));
		addItem(new Quote("5", title5, content5, author5));
		addItem(new Quote("6", title6, content6, author6));
		addItem(new Quote("7", title7, content7, author7));
		addItem(new Quote("8", title8, content8, author8));
		addItem(new Quote("9", title9, content9, author9));
		addItem(new Quote("10", title10, content10, author10));
		addItem(new Quote("11", title11, content11, author11));
		addItem(new Quote("12", title12, content12, author12));
		addItem(new Quote("13", title13, content13, author13));
		addItem(new Quote("14", title14, content14, author14));
	}

	private static void addItem(Quote item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of title.
	 */
	public static class Quote {
		public String id;

		public String title;

		private final String content;

		private final String author;

		public Quote(String id, String title, String content, String author) {
			this.id = id;
			this.title = title;
			this.content = content;
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public String getContent() {
			return content;
		}

		public String getAuthor() {
			return author;
		}

		public Drawable getAvatar(AssetManager assets) throws IOException {
			InputStream in = assets.open("avatars/" + getAuthor() + ".png");
			return Drawable.createFromStream(in, null);
		}

		@Override
		public String toString() {
			return title;
		}
	}
}
