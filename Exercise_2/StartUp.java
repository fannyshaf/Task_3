/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class StartUp{
	private Member[] member = new Member[100] ;
	private Project[] projectList = new Project[100];
	private int nMember;
	private int nProject = 0;
	
	public void addMember(Member m){
		member[nMember] = m;
		nMember = nMember + 1;
	}
	public Member getMember(int id){
		return member[id];
	}
	public void createNewProject(String projectName){
		Project project = new Project(projectName);
		projectList[nProject] = project;
		nProject = nProject + 1;
	}
	public Project getProject(int id){
		return projectList[id];
	}
	public void setProjectMember(Project p, Member m){
		p.addMember(m);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getNumReleaseProject(){
		int released = 0;
		for(int i=0;i<nProject;i++){
			if(projectList[i].isReleased()){
				released = released + 1;
			}
		}
		return released;
	}
}
