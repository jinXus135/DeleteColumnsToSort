import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SortColumns {
	
	private List <Integer> minDeletingSize(List <String> ind){
		List<Integer> mindelsize = new ArrayList<Integer>(0);
		try{
			int StrSize = ind.get(0).length();
			
			for(int i = 0; i<ind.size()-1; i++ ) {
				for(int j = 0; j< StrSize; j++) {
					if(ind.get(i).charAt(j)> ind.get(i+1).charAt(j)) {
						mindelsize.add(j);
						
					}
			
					/*else if (ind.get(i).length()!= ind.get(i+1).length()) {
						mindelsize = new ArrayList<Integer>(0);
						mindelsize.add(-1);
					}*/
					
				}
			
			}
			//mindelsize = delDup(mindelsize);
		}
		catch(Exception e){
			mindelsize = new ArrayList<Integer>(0);
			mindelsize.add(-1);
			
			
		}
			return mindelsize;
		
	}
	
	private List<Integer> delDup(List<Integer>ind){
		for(int i = 0; i < ind.size()-1; i++) {
			for(int j=i+1; j < ind.size()-1;j++) {
				if(ind.get(i) == ind.get(j)) {
					ind.remove(j);
				}
			}
			
		}
		ind.remove(ind.size()-1);
		return ind;
		
	}
	
	
	
	public static void main (String args[]) {
		
		SortColumns sort = new SortColumns();
		String[] arr = {"xzywabc","abcddef","gtryghi"};
		List<String> mylist = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(mylist);
		
		List<Integer> in = sort.minDeletingSize(mylist);
		System.out.println(in);
	
	}
}
