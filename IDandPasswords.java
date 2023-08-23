import java.util.HashMap;

import javax.swing.ImageIcon;
public class IDandPasswords {
	
	//HashMap<String,String> logininfo = new HashMap<String,String>();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	
	IDandPasswords(){
		
		logininfo.put("sidd","123");
		logininfo.put("Brometheus","PASSWORD");
		logininfo.put("BroCode","abc123");
		logininfo.put("SIDDESH ALHAT", "GSR"); 
			
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}