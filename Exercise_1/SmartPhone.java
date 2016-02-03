/* 	Nama : Fatima Nurshafarani
	Kelas : IF-38-01
	NIM	: 1301144245
 */
public class SmartPhone{
	private Application[] smappList = new Application[100];
	private int countApp;
	private int memory;
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public int getRemainingSize(){
		int m = memory;
		int i, used;
		i = 0;
		used = 0;
		while(smappList[i] != null){
			used = used + smappList[i].getappSize();
			i++;
		}
		return m = m-used;
	}
	
	public void addApplication(AppStore appStore, int appId){
		if(getRemainingSize() >= appStore.getApp(appId).getappSize()){
			smappList[countApp] = appStore.getApp(appId);
			countApp++;
		}
	}
	
	public String toString(){
		return("Memory Size "+memory+","+countApp+" application installed, remaining memory size : "+getRemainingSize());
	}
}
