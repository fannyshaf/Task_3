/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class Project{
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
	}
	public void addMember(Member m){
		teamMember[nTeam] = m;
		nTeam = nTeam + 1;
	}
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		this.releaseStatus = true;
	}
	public String toString(){
		String status;
		if (isReleased()){
			status = "completed";
		}else{
			status = "in progress";
		}
		return(projectName+ " status is "+status+" with team member of "+nTeam);
	}
}