/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class Driver{
	public static void main(String[] args){
		AppStore aps = new AppStore();
		SmartPhone sm = new SmartPhone();
		aps.createNewApp("app1",100);
		aps.createNewApp("app2",200);
		aps.createNewApp("app3",300);
		aps.createNewApp("app4",400);
	
		System.out.println(aps.toString());
		System.out.println(aps.getApp(0).toString());
		System.out.println(aps.getApp(1).toString());
		System.out.println(aps.getApp(2).toString());
		System.out.println(aps.getApp(3).toString());
		
		sm.setMemory(300);
		
		System.out.println(sm.toString());
		sm.addApplication(aps,0);
		System.out.println(sm.toString());
		sm.addApplication(aps,1);
		System.out.println(sm.toString());
		sm.addApplication(aps,2);
		System.out.println(sm.toString());
		sm.addApplication(aps,3);
		System.out.println(sm.toString());
	}
}
