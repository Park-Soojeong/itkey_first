package com.itkey.sam.writer.dto;

public class WriterDTO {
	
	private String boardWriter = null;
	private String boardWriterName = null;
	private String boardWriterPw = null;
	private String boardWriterPhone = null;
	private String boardWriterEmail = null;
	private String fileIdx = null;
	private String boardWriterJoinDate = null;
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardWriterName() {
		return boardWriterName;
	}
	public void setBoardWriterName(String boardWriterName) {
		this.boardWriterName = boardWriterName;
	}
	public String getBoardWriterPw() {
		return boardWriterPw;
	}
	public void setBoardWriterPw(String boardWriterPw) {
		this.boardWriterPw = boardWriterPw;
	}
	public String getBoardWriterPhone() {
		return boardWriterPhone;
	}
	public void setBoardWriterPhone(String boardWriterPhone) {
		this.boardWriterPhone = boardWriterPhone;
	}
	public String getBoardWriterEmail() {
		return boardWriterEmail;
	}
	public void setBoardWriterEmail(String boardWriterEmail) {
		this.boardWriterEmail = boardWriterEmail;
	}
	public String getFileIdx() {
		return fileIdx;
	}
	public void setFileIdx(String fileIdx) {
		this.fileIdx = fileIdx;
	}
	public String getBoardWriterJoinDate() {
		return boardWriterJoinDate;
	}
	public void setBoardWriterJoinDate(String boardWriterJoinDate) {
		this.boardWriterJoinDate = boardWriterJoinDate;
	}
	@Override
	public String toString() {
		return "WriterDTO [boardWriter=" + boardWriter + ", boardWriterName=" + boardWriterName + ", boardWriterPw="
				+ boardWriterPw + ", boardWriterPhone=" + boardWriterPhone + ", boardWriterEmail=" + boardWriterEmail
				+ ", fileIdx=" + fileIdx + ", boardWriterJoinDate=" + boardWriterJoinDate + ", getBoardWriter()="
				+ getBoardWriter() + ", getBoardWriterName()=" + getBoardWriterName() + ", getBoardWriterPw()="
				+ getBoardWriterPw() + ", getBoardWriterPhone()=" + getBoardWriterPhone() + ", getBoardWriterEmail()="
				+ getBoardWriterEmail() + ", getFileIdx()=" + getFileIdx() + ", getBoardWriterJoinDate()="
				+ getBoardWriterJoinDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
