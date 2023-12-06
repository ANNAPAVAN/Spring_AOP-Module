package com.pavan.service;

import com.pavan.beans.Show;

public class ShowServiceImpl implements ShowService {

	public String runShow(Show show) throws RuntimeException {
		System.out.println("Show "+show.getName()+" start");
		System.out.println("Show "+show.getName()+" running Successfully");
		if(!show.getName().equalsIgnoreCase("Mimicry"))
		{
			throw new RuntimeException();
		}
		System.out.println("Show "+show.getName()+" end!!");
		return "Success";
	}

}
