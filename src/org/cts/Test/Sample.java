package org.cts.Test;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<EncapProgram> s = new LinkedHashSet<EncapProgram>();

EncapProgram e = new EncapProgram();
e.setEmpId(1812);
e.setEmpEmail("murali1812@gmail.com");
e.setEmpName("murali");

EncapProgram e1 = new EncapProgram();
e1.setEmpId(1212);
e1.setEmpEmail("pravi1812@gmail.com");
e1.setEmpName("pravi");

s.add(e);
s.add(e1);

for(EncapProgram x:s) {
	
  System.out.println(x.getEmpId()); 
  System.out.println(x.getEmpName()); 
  System.out.println(x.getEmpEmail()); 
	}

}

	
}
