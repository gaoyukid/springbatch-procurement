package sample.csv.process.model;

import java.util.Date;

public class WebsiteResource extends Website {
	boolean valid;
	Date first_inserted_when;
	Date last_updated_when;
	boolean deleted;
	
	public WebsiteResource()
	{
		
		super();
	}
	public WebsiteResource(Website website)
	{
		super();
		this.setId(website.getId());
		this.setName(website.getName());
		this.setUrl(website.getUrl());
	}
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public Date getFirst_inserted_when() {
		return first_inserted_when;
	}
	public void setFirst_inserted_when(Date first_inserted_when) {
		this.first_inserted_when = first_inserted_when;
	}
	public Date getLast_updated_when() {
		return last_updated_when;
	}
	public void setLast_updated_when(Date last_updated_when) {
		this.last_updated_when = last_updated_when;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
