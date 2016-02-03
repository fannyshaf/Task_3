/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class AppStore{
	private Application[] appList = new Application[100];
	private int countApp = 0;
	
	public void createNewApp(String appName, int appSize){
		Application app = new Application(appName, appSize);
		appList[countApp] = app;
		countApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	public int getCountApp(Application app){
		return countApp;
	}
	public Application[] getAppList(){
		return appList;
	}
	
	public String toString(){
		return("There are "+countApp+"application ready to install");
	}
}
