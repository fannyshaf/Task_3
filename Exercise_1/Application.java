/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class Application{
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getappName(){
		return appName;
	}
	
	public int getappSize(){
		return appSize;
	}
	
	public String toString(){
		return("Application Name "+appName+", with size : "+appSize+"MB");
	}
}
