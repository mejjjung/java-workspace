package ch07;

public class BlogDTO {
	private String userName;
	private String postSubject;
	private String updateDate;
	private String reply;
	private String createReply;
	private int user_id;
	
	public BlogDTO(int user_id, String userName) {
		this.user_id = user_id;
		this.userName = userName;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostSubject() {
		return postSubject;
	}
	public void setPostSubject(String postSubject) {
		this.postSubject = postSubject;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getCreateReply() {
		return createReply;
	}
	public void setCreateReply(String createReply) {
		this.createReply = createReply;
	}
	
	
	
}
