package _22_queqe;

import java.util.Comparator;
public class ConditionCamparator implements Comparator<Patient> {
	
	public int compare(Patient o1,Patient o2)
	{
		
		return o1.getCondition().compareTo(o2.getCondition());
	}

}
