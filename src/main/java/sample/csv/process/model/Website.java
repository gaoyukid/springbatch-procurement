package sample.csv.process.model;


public class Website {
	String name;
	String url;
	int id;
	
	public Website()
	{
		
	}
	
	public Website(WebsiteResource website)
	{
		super();
		this.setId(website.getId());
		this.setName(website.getName());
		this.setUrl(website.getUrl());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
