package com.java.membership;

import java.util.List;

 public class Membership {
	    private String type;
	    private int durationMonths;
	    private double price;
	    private List<String> benefits;

	    public Membership(String type, int durationMonths, double price, List<String> benefits) {
	        this.type = type;
	        this.durationMonths = durationMonths;
	        this.price = price;
	        this.benefits = benefits;
	    }

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getDurationMonths() {
			return durationMonths;
		}

		public void setDurationMonths(int durationMonths) {
			this.durationMonths = durationMonths;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public List<String> getBenefits() {
			return benefits;
		}

		public void setBenefits(List<String> benefits) {
			this.benefits = benefits;
		}
	    
		@Override
		 public String toString() {
	       // StringBuilder sb = new StringBuilder();
	        return "Membership Type: " + type + "Membership Duration: " + durationMonths +"Membership Price" +
	        		price + "Membership Benefit" + benefits;
	        
	    }
	}
