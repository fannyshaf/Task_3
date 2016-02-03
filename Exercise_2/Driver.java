/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member alex = new Member("Alex");
		Member beni = new Member("Beni");
		Member cakra = new Member("Cakra");
		Member deni = new Member("Deni");
		Member erik = new Member("Erik");
		
		stp.addMember(alex);
		stp.addMember(beni);
		stp.addMember(cakra);
		stp.addMember(deni);
		stp.addMember(erik);
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		
		Project p = stp.getProject(0);
		Member m = stp.getMember(0);
		stp.setProjectMember(p,m);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		
		p = stp.getProject(1);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		m = stp.getMember(2);
		stp.setProjectMember(p,m);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		m = stp.getMember(4);
		stp.setProjectMember(p,m);
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getNumReleaseProject());
	}
}