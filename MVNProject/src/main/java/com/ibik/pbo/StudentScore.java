package com.ibik.pbo;

public class StudentScore {
	private Integer student_score_id;
	private String npm;
	private String nama;
	private String nilai;
	
	public Integer getScoreId() {
		return student_score_id;
	}
	public void setScoreId(Integer student_score_id) {
		this.student_score_id = student_score_id;
	}
	
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNilai() {
		return nilai;
	}
	public void setNilai(String nilai) {
		this.nilai = nilai;
	}
}



