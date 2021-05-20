import java.util.*;

class MyDictionary 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> obj = new Hashtable<Integer, String>();
		obj.put(2,"abc8");
		obj.put(4,"abc");
		obj.put(10,"abc2");
		obj.put(5,"abc3");
		obj.put(6,"abc5");
		obj.put(20,"abc6");
		obj.put(26,"abc7");
		
		System.out.println("\n");
		System.out.println("Getting result by Converting Hashtable into Treemap");
		
		
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (obj);
		System.out.println(tm);	
		
			System.out.println("\n");
			System.out.println("Getting sorted result useing only Hashtable");
			
			Integer[] array = new Integer[obj.size()];
			int j=0,k=0;
			int index=0,value=0;
	
			for(Integer i:obj.keySet()){
				
				if(array[j]==null){
					array[j]=i;	
				}	
				else{
						value=index;
						j=index;
						array[++index]=i;
						if(array[j]>i){
								for(j=value;j>=0;j--){
									int store=array[j+1];
									array[j+1]= array[j];
									array[j]=store;
								}
							j=0;
					
						}
				}	
				
			}
			
			while(k<array.length){
				System.out.println("{ key= "+array[k]+" value= "+obj.get(array[k])+" }");
				k++;
			}
		
	}
}
		