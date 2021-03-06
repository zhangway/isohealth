package com.isobar.isohealth.models;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class NewGeneralMeasurement {
	private String timestamp; // The time at which the measurement was taken (e.g., "Sat, 1 Jan 2011 00:00:00")
	
	// One of the following values: vitamin_d, hscrp, crp, tsh, uric_acid, systolic, diastolic, total_cholesterol, hdl, ldl
	private Double vitamin_d; // The value of the measured quantity
	private Double hscrp; // The value of the measured quantity
	private Double crp; // The value of the measured quantity
	private Double tsh; // The value of the measured quantity
	private Double uric_acid; // The value of the measured quantity
	private Double systolic; // The value of the measured quantity
	private Double diastolic; // The value of the measured quantity
	private Double total_cholesterol; // The value of the measured quantity
	private Double hdl; // The value of the measured quantity
	private Double ldl; // The value of the measured quantity

	private Boolean post_to_twitter; // Whether to post this measurement to Twitter (optional; if omitted, the user's default setting will be used)
	private Boolean post_to_facebook; // Whether to post this measurement to Facebook (optional; if omitted, the user's default setting will be used)
	
	public NewGeneralMeasurement() {
		super();
	}
	public NewGeneralMeasurement(String timestamp, Double vitamin_d,
			Double hscrp, Double crp, Double tsh, Double uric_acid,
			Double systolic, Double diastolic, Double total_cholesterol,
			Double hdl, Double ldl, Boolean post_to_twitter,
			Boolean post_to_facebook) {
		super();
		this.timestamp = timestamp;
		this.vitamin_d = vitamin_d;
		this.hscrp = hscrp;
		this.crp = crp;
		this.tsh = tsh;
		this.uric_acid = uric_acid;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.total_cholesterol = total_cholesterol;
		this.hdl = hdl;
		this.ldl = ldl;
		this.post_to_twitter = post_to_twitter;
		this.post_to_facebook = post_to_facebook;
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
	public Boolean getPost_to_twitter() {
		return post_to_twitter;
	}
	public void setPost_to_twitter(Boolean post_to_twitter) {
		this.post_to_twitter = post_to_twitter;
	}
	public Boolean getPost_to_facebook() {
		return post_to_facebook;
	}
	public void setPost_to_facebook(Boolean post_to_facebook) {
		this.post_to_facebook = post_to_facebook;
	}
	@Override
	public String toString() {
		return "NewGeneralMeasurement [timestamp=" + timestamp + ", vitamin_d="
				+ vitamin_d + ", hscrp=" + hscrp + ", crp=" + crp + ", tsh="
				+ tsh + ", uric_acid=" + uric_acid + ", systolic=" + systolic
				+ ", diastolic=" + diastolic + ", total_cholesterol="
				+ total_cholesterol + ", hdl=" + hdl + ", ldl=" + ldl
				+ ", post_to_twitter=" + post_to_twitter
				+ ", post_to_facebook=" + post_to_facebook + "]";
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
				+ ((post_to_facebook == null) ? 0 : post_to_facebook.hashCode());
		result = prime * result
				+ ((post_to_twitter == null) ? 0 : post_to_twitter.hashCode());
		result = prime * result
				+ ((systolic == null) ? 0 : systolic.hashCode());
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime
				* result
				+ ((total_cholesterol == null) ? 0 : total_cholesterol
						.hashCode());
		result = prime * result + ((tsh == null) ? 0 : tsh.hashCode());
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
		NewGeneralMeasurement other = (NewGeneralMeasurement) obj;
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
		if (post_to_facebook == null) {
			if (other.post_to_facebook != null)
				return false;
		} else if (!post_to_facebook.equals(other.post_to_facebook))
			return false;
		if (post_to_twitter == null) {
			if (other.post_to_twitter != null)
				return false;
		} else if (!post_to_twitter.equals(other.post_to_twitter))
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
}
