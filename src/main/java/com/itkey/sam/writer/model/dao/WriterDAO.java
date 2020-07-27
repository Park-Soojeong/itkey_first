package com.itkey.sam.writer.model.dao;

import java.util.List;

import com.itkey.sam.writer.dto.WriterDTO;

public interface WriterDAO {
	
	public List<WriterDTO> selectWriterList(WriterDTO wDTO) throws Exception;
	public int selectWriter(WriterDTO wDTO) throws Exception;

}
