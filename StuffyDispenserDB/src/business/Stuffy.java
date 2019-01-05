package business;

public class Stuffy {
	private int id;
	private String type;
	private String color;
	private String size;
	
	public Stuffy(int id, String type, String color, String size) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", type=" + type + ", color=" + color + ", size=" + size + "]";
	}

}
