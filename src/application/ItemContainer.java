package application;

import java.util.ArrayList;
import java.util.List;

public class ItemContainer implements FarmComponent {
    private String name;
    private List<Item> items;
    private double x, y, width, height;

    // Constructor to initialize the container with a name, position, and size
    public ItemContainer(String name, double x, double y, double width, double height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.items = new ArrayList<>();
    }

    // Implement the getName() method from FarmComponent
    @Override
    public String getName() {
        return name;
    }


    // Get all the items in this container
    public List<Item> getItems() {
        return items;
    }

    // Getters and setters for x, y, width, height
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

	@Override
	public void rename(String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	// In ItemContainer class
	public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }


}
