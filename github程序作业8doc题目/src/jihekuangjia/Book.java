package jihekuangjia;

public class Book {
	private String id;
	private String name;
	private String price;
	private String press;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", price=" + price + ", press=" + press + "]";
	}
}
