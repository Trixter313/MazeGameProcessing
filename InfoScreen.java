public class InfoScreen {
	String title;
	String body;

	InfoScreen(String tempTitle, String tempBody) {
		title = tempTitle;
		body = tempBody;
	}

	public void display(App main) {
		main.fill(255, 255, 255);
		// It won't let me use "CENTER" like the reference docs.. expects an int?
		main.textAlign(2);
		main.textSize(32);
		main.text(title, main.width / 2, 400);
		main.textSize(18);
		// Removed b/c centering isn't wprking
		// main.text(body, main.width / 2, 460);
		main.text(body, main.width / 2 - 400, 460);
	}
}
