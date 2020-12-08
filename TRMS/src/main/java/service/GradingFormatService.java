package service;

import java.util.List;

import daos.GFormatDAO;
import daos.GFormatDAOim;
import models.GradingFormat;

public class GradingFormatService {
	
	public static GFormatDAO gf = new GFormatDAOim();
	
	public static GradingFormat getFormat() {
		
		return gf.getFormat();
	}
	
	public static List <GradingFormat> getAllFormats(){
		
		return gf.getAllFormats();
	}
	


}
