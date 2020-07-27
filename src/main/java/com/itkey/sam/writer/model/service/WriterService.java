package com.itkey.sam.writer.model.service;

import java.util.List;

import com.itkey.sam.writer.dto.WriterDTO;

public interface WriterService {
	
	public List<WriterDTO> getWriterList(WriterDTO wDTO) throws Exception;
	public int getWriter(WriterDTO wDTO) throws Exception;

}
