package com.isobar.isohealth.models;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class GeneralMeasurementFeed {
	private Integer size; // The total number of general measurements across all pages
	private Item[] items; // The user's general measurements, in reverse chronological order
	private String previous; // The URI of the previous page of general measurements for the user (omitted for the earliest page)
	private String next; // The URI of the next page of general measurements for the user (omitted for the most recent page)
	
	@JsonSerialize(include = Inclusion.NON_NULL)
	public static class Item {
		private String timestamp; // The time at which the measurement was taken (e.g., "Sat, 1 Jan 2011 00:00:00")
		
		//	One of the following values: vitamin_d, hscrp, crp, tsh, uric_acid, systolic, diastolic, resting_heartrate, total_cholesterol, hdl, ldl
		private Double vitamin_d; // The value of the measured quantity
		private Double hscrp; // The value of the measured quantity
		private Double crp; // The value of the measured quantity
		private Double tsh; // The value of the measured quantity
		private Double uric_acid; // The value of the measured quantity
		private Double systolic; // The value of the measured quantity
		private Double diastolic; // The value of the measured quantity
		private Double resting_heartrate; // The value of the measured quantity
		private Double total_cholesterol; // The value of the measured quantity
		private Double hdl; // The value of the measured quantity
		private Double ldl; // The value of the measured quantity
		
		private String uri; // The URI of detailed information for the general measurement

		public Item() {
			super();
		}
		public Item(String timestamp, Double vitamin_d, Double hscrp,
				Double crp, Double tsh, Double uric_acid, Double systolic,
				Double diastolic, Double resting_heartrate,
				Double total_cholesterol, Double hdl, Double ldl, String uri) {
			super();
			this.timestamp = timestamp;
			this.vitamin_d = vitamin_d;
			this.hscrp = hscrp;
			this.crp = crp;
			this.tsh = tsh;
			this.uric_acid = uric_acid;
			this.systolic = systolic;
			this.diastolic = diastolic;
			this.resting_heartrate = resting_heartrate;
			this.total_cholesterol = total_cholesterol;
			this.hdl = hdl;
			this.ldl = ldl;
			this.uri = uri;
		}
		
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public Double getVitamin_d() {
			return vitamin_d;
		}
		public void setVitamin_d(Double vitamin_d) {
			this.vitamin_d = vitamin_d;
		}
		public Double getHscrp() {
			return hscrp;
		}
		public void setHscrp(Double hscrp) {
			this.hscrp = hscrp;
		}
		public Double getCrp() {
			return crp;
		}
		public void setCrp(Double crp) {
			this.crp = crp;
		}
		public Double getTsh() {
			return tsh;
		}
		public void setTsh(Double tsh) {
			this.tsh = tsh;
		}
		public Double getUric_acid() {
			return uric_acid;
		}
		public void setUric_acid(Double uric_acid) {
			this.uric_acid = uric_acid;
		}
		public Double getSystolic() {
			return systolic;
		}
		public void setSystolic(Double systolic) {
			this.systolic = systolic;
		}
		public Double getDiastolic() {
			return diastolic;
		}
		public void setDiastolic(Double diastolic) {
			this.diastolic = diastolic;
		}
		public Double getResting_heartrate() {
			return resting_heartrate;
		}
		public void setResting_heartrate(Double resting_heartrate) {
			this.resting_heartrate = resting_heartrate;
		}
		public Double getTotal_cholesterol() {
			return total_cholesterol;
		}
		public void setTotal_cholesterol(Double total_cholesterol) {
			this.total_cholesterol = total_cholesterol;
		}
		public Double getHdl() {
			return hdl;
		}
		public void setHdl(Double hdl) {
			this.hdl = hdl;
		}
		public Double getLdl() {
			return ldl;
		}
		public void setLdl(Double ldl) {
			this.ldl = ldl;
		}
		public String getUri() {
			return uri;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((crp == null) ? 0 : crp.hashCode());
			result = prime * result
					+ ((diastolic == null) ? 0 : diastolic.hashCode());
			result = prime * result + ((hdl == null) ? 0 : hdl.hashCode());
			result = prime * result + ((hscrp == null) ? 0 : hscrp.hashCode());
			result = prime * result + ((ldl == null) ? 0 : ldl.hashCode());
			result = prime
					* result
					+ ((resting_heartrate == null) ? 0 : resting_heartrate
							.hashCode());
			result = prime * result
					+ ((systolic == null) ? 0 : systolic.hashCode());
			result = prime * result
					+ ((timestamp == null) ? 0 : timestamp.hashCode());
			result = prime
					* result
					+ ((total_cholesterol == null) ? 0 : total_cholesterol
							.hashCode());
			result = prime * result + ((tsh == null) ? 0 : tsh.hashCode());
			result = prime * result + ((uri == null) ? 0 : uri.hashCode());
			result = prime * result
					+ ((uric_acid == null) ? 0 : uric_acid.hashCode());
			result = prime * result
					+ ((vitamin_d == null) ? 0 : vitamin_d.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (crp == null) {
				if (other.crp != null)
					return false;
			} else if (!crp.equals(other.crp))
				return false;
			if (diastolic == null) {
				if (other.diastolic != null)
					return false;
			} else if (!diastolic.equals(other.diastolic))
				return false;
			if (hdl == null) {
				if (other.hdl != null)
					return false;
			} else if (!hdl.equals(other.hdl))
				return false;
			if (hscrp == null) {
				if (other.hscrp != null)
					return false;
			} else if (!hscrp.equals(other.hscrp))
				return false;
			if (ldl == null) {
				if (other.ldl != null)
					return false;
			} else if (!ldl.equals(other.ldl))
				return false;
			if (resting_heartrate == null) {
				if (other.resting_heartrate != null)
					return false;
			} else if (!resting_heartrate.equals(other.resting_heartrate))
				return false;
			if (systolic == null) {
				if (other.systolic != null)
					return false;
			} else if (!systolic.equals(other.systolic))
				return false;
			if (timestamp == null) {
				if (other.timestamp != null)
					return false;
			} else if (!timestamp.equals(other.timestamp))
				return false;
			if (total_cholesterol == null) {
				if (other.total_cholesterol != null)
					return false;
			} else if (!total_cholesterol.equals(other.total_cholesterol))
				return false;
			if (tsh == null) {
				if (other.tsh != null)
					return false;
			} else if (!tsh.equals(other.tsh))
				return false;
			if (uri == null) {
				if (other.uri != null)
					return false;
			} else if (!uri.equals(other.uri))
				return false;
			if (uric_acid == null) {
				if (other.uric_acid != null)
					return false;
			} else if (!uric_acid.equals(other.uric_acid))
				return false;
			if (vitamin_d == null) {
				if (other.vitamin_d != null)
					return false;
			} else if (!vitamin_d.equals(other.vitamin_d))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Item [timestamp=" + timestamp + ", vitamin_d=" + vitamin_d
					+ ", hscrp=" + hscrp + ", crp=" + crp + ", tsh=" + tsh
					+ ", uric_acid=" + uric_acid + ", systolic=" + systolic
					+ ", diastolic=" + diastolic + ", resting_heartrate="
					+ resting_heartrate + ", total_cholesterol="
					+ total_cholesterol + ", hdl=" + hdl + ", ldl=" + ldl
					+ ", uri=" + uri + "]";
		}
		
		
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}
	
}