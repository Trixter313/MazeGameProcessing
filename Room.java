import processing.core.PImage;

public class Room {
	PImage roomImage;

	Room(String imagePath, App main) {
		roomImage = main.loadImage(imagePath);
	}

	public void display(App main) {
		main.image(roomImage, 0, 0);
		roomImage.resize(main.width, main.height);
	}
}
