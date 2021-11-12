/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

public class demo {
	public static void main(String[]args)
	{
		try {
			File f= new File("C:\\Users\\Admin\\Desktop\\cse221 lab\\input.txt");
			Scanner sc= new Scanner(f);
			
			String s= sc.nextLine(); 
			int vert=Integer.parseInt(s);
			
			ArrayList<ArrayList<Object>>list=new ArrayList<ArrayList<Object>>();
			
			for(int i=0 ; i<vert ; ++i) {
				ArrayList<Object>babylist= new ArrayList<Object>();
		 		list.add(babylist);
				
				for(int j=0 ; j<vert ; ++j ) {
					list.get(i).add(0);
					
                                }
			}
		
		
		while(sc.hasNext()) {
			
			String StA [] = new String [2];
			String st = sc.nextLine();
			
			StA= st.split(" ");
			
			int vertex = Integer.parseInt(StA[0]);
			int connect = Integer.parseInt(StA[1]);
			list.get(vertex).add(connect);	
		}
		
		for(int i=0; i<vert ; ++i) {
			
		System.out.print(i + "==>");
		for(int k=0; k<vert;++k) {
			
			System.out.print(list.get(i).get(k)+" ");
		}
		   System.out.println();
		}
		
		}
		catch(Exception e) {
			
		}
	
	}

}


