import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class App extends PApplet {

	// Declarations
	int currentRoom = -1, hoveredDoor;
	InfoScreen welcomeScreen;
	Button startButton;
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<PImage> roomImages = new ArrayList<PImage>();

	public void settings() {
		size(1700, 1000);
	}

	public void setup() {
		surface.setTitle("Maze Game");

		// Initialization
		welcomeScreen = new InfoScreen("HOW TO PLAY", "Click on doors to explore the maze." + "\n"
				+ "Some rooms look alike! (Low budget) Just act like it is intentional and meant to add difficulty to the game. ;)"
				+ "\n"
				+ "There are also special objects scattered in rooms throughout the maze that will perform actions for you when used.");
		startButton = new Button(color(66, 135, 245), color(255, 255, 255), "START GAME", width / 2 - 62, height / 2 + 50,
				124, 27);
		rooms.add(new Room("room0.jpg", this));
		rooms.add(new Room("room1.jpg", this));
		rooms.add(new Room("room2.jpg", this));
		rooms.add(new Room("room3.jpg", this));
		rooms.add(new Room("room4.jpg", this));
		rooms.add(new Room("room5.jpg", this));
		rooms.add(new Room("room6.jpg", this));
		rooms.add(new Room("room7.jpg", this));
		rooms.add(new Room("room8.jpg", this));
		rooms.add(new Room("room9.jpg", this));
		rooms.add(new Room("room10.jpg", this));
		rooms.add(new Room("room11.jpg", this));
	}

	public void draw() {
		background(0, 0, 0);

		// Display room based on currentRoom variable
		switch (currentRoom) {
			case -1:
				welcomeScreen.display(this);
				startButton.display(this);
				break;
			case 0:
				rooms.get(0).display(this);

				// Logic for changing cursor to hand
				if (mouseX > 327 && mouseX < 327 + (602 - 327) && mouseY > 205 && mouseY < 205 + (891 - 205)) {
					hoveredDoor = 1;
					cursor(HAND);
				} else if (mouseX > 1075 && mouseX < 1075 + (1349 - 1075) && mouseY > 205 && mouseY < 205 + (891 - 205)) {
					hoveredDoor = 7;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 1:
				rooms.get(1).display(this);

				if (mouseX > 80 && mouseX < 80 + (310 - 80) && mouseY > 136 && mouseY < 136 + (855 - 136)) {
					hoveredDoor = 2;
					cursor(HAND);
				} else if (mouseX > 558 && mouseX < 558 + (695 - 558) && mouseY > 194 && mouseY < 194 + (802 - 194)) {
					hoveredDoor = 10;
					cursor(HAND);
				} else if (mouseX > 833 && mouseX < 833 + (1017 - 833) && mouseY > 225 && mouseY < 225 + (697 - 225)) {
					hoveredDoor = 0;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 2:
				rooms.get(2).display(this);

				if (mouseX > 867 && mouseX < 867 + (1052 - 867) && mouseY > 260 && mouseY < 260 + (824 - 260)) {
					hoveredDoor = 3;
					cursor(HAND);
				} else if (mouseX > 1307 && mouseX < 1307 + (1544 - 1307) && mouseY > 236 && mouseY < 236 + (907 - 236)) {
					hoveredDoor = 1;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 3:
				rooms.get(3).display(this);

				if (mouseX > 152 && mouseX < 152 + (380 - 152) && mouseY > 213 && mouseY < 213 + (891 - 213)) {
					hoveredDoor = 2;
					cursor(HAND);
				} else if (mouseX > 646 && mouseX < 646 + (833 - 646) && mouseY > 268 && mouseY < 268 + (833 - 268)) {
					hoveredDoor = 4;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 4:
				rooms.get(4).display(this);

				if (mouseX > 674 && mouseX < 674 + (876 - 674) && mouseY > 212 && mouseY < 212 + (693 - 212)) {
					hoveredDoor = 3;
					cursor(HAND);
				} else if (mouseX > 984 && mouseX < 984 + (1149 - 984) && mouseY > 201 && mouseY < 201 + (809 - 201)) {
					hoveredDoor = 11;
					cursor(HAND);
				} else if (mouseX > 1381 && mouseX < 1381 + (1615 - 1381) && mouseY > 142 && mouseY < 142 + (875 - 142)) {
					hoveredDoor = 5;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 5:
				rooms.get(5).display(this);

				if (mouseX > 152 && mouseX < 152 + (380 - 152) && mouseY > 213 && mouseY < 213 + (891 - 213)) {
					hoveredDoor = 4;
					cursor(HAND);
				} else if (mouseX > 646 && mouseX < 646 + (833 - 646) && mouseY > 268 && mouseY < 268 + (833 - 268)) {
					hoveredDoor = 6;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 6:
				rooms.get(6).display(this);

				if (mouseX > 152 && mouseX < 152 + (380 - 152) && mouseY > 213 && mouseY < 213 + (891 - 213)) {
					hoveredDoor = 5;
					cursor(HAND);
				} else if (mouseX > 646 && mouseX < 646 + (833 - 646) && mouseY > 268 && mouseY < 268 + (833 - 268)) {
					hoveredDoor = 12;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 7:
				rooms.get(7).display(this);

				if (mouseX > 674 && mouseX < 674 + (876 - 674) && mouseY > 212 && mouseY < 212 + (693 - 212)) {
					hoveredDoor = 0;
					cursor(HAND);
				} else if (mouseX > 984 && mouseX < 984 + (1149 - 984) && mouseY > 201 && mouseY < 201 + (809 - 201)) {
					hoveredDoor = 10;
					cursor(HAND);
				} else if (mouseX > 1381 && mouseX < 1381 + (1615 - 1381) && mouseY > 142 && mouseY < 142 + (875 - 142)) {
					hoveredDoor = 8;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 8:
				rooms.get(8).display(this);

				if (mouseX > 152 && mouseX < 152 + (380 - 152) && mouseY > 213 && mouseY < 213 + (891 - 213)) {
					hoveredDoor = 7;
					cursor(HAND);
				} else if (mouseX > 646 && mouseX < 646 + (833 - 646) && mouseY > 268 && mouseY < 268 + (833 - 268)) {
					hoveredDoor = 9;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 9:
				rooms.get(9).display(this);

				if (mouseX > 0 && mouseX < 0 + (64 - 0) && mouseY > 50 && mouseY < 50 + (height - 50)) {
					hoveredDoor = 8;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 10:
				rooms.get(10).display(this);

				if (mouseX > 112 && mouseX < 112 + (259 - 112) && mouseY > 308 && mouseY < 308 + (798 - 308)) {
					hoveredDoor = 1;
					cursor(HAND);
				} else if (mouseX > 1437 && mouseX < 1437 + (1591 - 1437) && mouseY > 320 && mouseY < 320 + (797 - 320)) {
					hoveredDoor = 7;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			case 11:
				rooms.get(11).display(this);

				if (mouseX > 1631 && mouseX < 1631 + (width - 1631) && mouseY > 50 && mouseY < 50 + (height - 50)) {
					hoveredDoor = 4;
					cursor(HAND);
				} else {
					hoveredDoor = -1;
					cursor(ARROW);
				}

				break;
			default:

				break;
		}
	}

	public void mouseClicked() {
		// To get bounds of doors
		// System.out.println("xPos: " + mouseX + ", yPos: " + mouseY);

		switch (hoveredDoor) {
			case 0:
				currentRoom = 0;
				break;
			case 1:
				currentRoom = 1;
				break;
			case 2:
				currentRoom = 2;
				break;
			case 3:
				currentRoom = 3;
				break;
			case 4:
				currentRoom = 4;
				break;
			case 5:
				currentRoom = 5;
				break;
			case 6:
				currentRoom = 6;
				break;
			case 7:
				currentRoom = 7;
				break;
			case 8:
				currentRoom = 8;
				break;
			case 9:
				currentRoom = 9;
				break;
			case 10:
				currentRoom = 10;
				break;
			case 11:
				currentRoom = 11;
				break;
			default:

				break;
		}
	}

	public static void main(String[] args) {
		PApplet.main("App");
	}
}
