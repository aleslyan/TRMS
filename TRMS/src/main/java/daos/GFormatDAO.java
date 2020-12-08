package daos;

import java.util.List;

import models.GradingFormat;

public interface GFormatDAO {
	
	public GradingFormat getFormat();
	public List <GradingFormat> getAllFormats();
	
}
