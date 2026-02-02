package streamBuzz;

public class CreatorStats {
	public String creatorName;
	public double[] weeklyLikes;
	
	public CreatorStats(String creatorName, double[] weeklyLikes) {
		this.creatorName = creatorName;
		this.weeklyLikes = weeklyLikes;
	}
	
	public String getCreatorName() {return creatorName;}
	public void setCreatorName(String creatorName) {this.creatorName = creatorName;}
	
	public double[] getWeeklyLikes() {return weeklyLikes;}
	public void setWeeklyLikes(double[] weeklyLikes) {this.weeklyLikes = weeklyLikes;}
}
