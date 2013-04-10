package kr.example.rssfeed;

import java.util.Date;

public class Feed {

	private Date qdate;
	private String details;
	private String linkString;

	public Feed(Date qdate, String details, String linkString) {
		super();
		this.qdate = qdate;
		this.details = details;
		this.linkString = linkString;
	}

	@Override
	public String toString() {
		return "Feed [qdate=" + qdate + ", details=" + details
				+ ", linkString=" + linkString + "]";
	}

}
