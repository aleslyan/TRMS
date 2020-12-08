package models;

public class GradingFormat {

		private int id;
		private String format;
		private String passGrade;
		
		
		public GradingFormat() {
			super();
		}


		public GradingFormat(String format, String passGrade) {
			super();
			this.format = format;
			this.passGrade = passGrade;
		}


		public GradingFormat(int id, String format, String passGrade) {
			super();
			this.id = id;
			this.format = format;
			this.passGrade = passGrade;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFormat() {
			return format;
		}


		public void setFormat(String format) {
			this.format = format;
		}


		public String getPassGrade() {
			return passGrade;
		}


		public void setPassGrade(String passGrade) {
			this.passGrade = passGrade;
		}


		@Override
		public String toString() {
			return "GradingFormat [id=" + id + ", format=" + format + ", passGrade=" + passGrade + "]";
		}
		
		
		
}
