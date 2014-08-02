package sample.csv.process.model;

public class EnrichedWebsiteResource extends WebsiteResource {
	// the content read by readability
	String content;
	String title;
	public EnrichedWebsiteResource()
	{
		super();
	}
	public EnrichedWebsiteResource(WebsiteResource websiteResource)
	{
		
		super();
		this.setId(websiteResource.getId());
		this.setDeleted(websiteResource.isDeleted());
		this.setFirst_inserted_when(websiteResource.getFirst_inserted_when());
		this.setLast_updated_when(websiteResource.getLast_updated_when());
		this.setName(websiteResource.getName());
		this.setUrl(websiteResource.getUrl());
		this.setValid(websiteResource.isValid());
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getContentLength() {
		int length = 0;
		length = (content == null) ? 0 : content.length();
		return length;
	}
}
