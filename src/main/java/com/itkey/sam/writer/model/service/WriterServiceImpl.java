package com.itkey.sam.writer.model.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itkey.sam.writer.dto.WriterDTO;
import com.itkey.sam.writer.model.dao.WriterDAO;

public class WriterServiceImpl implements WriterService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="writerDAO") WriterDAO dao;

	@Override
	public List<WriterDTO> getWriterList(WriterDTO wDTO) throws Exception {
		logger.debug("* [SERVICE] Input  ◀ (Controller) : " + wDTO.toString());
		List<WriterDTO> returnList = dao.selectWriterList(wDTO);
		logger.debug("* [SERVICE] Output ◀ (DAO) : " + returnList.toString());
		return returnList;
	};

	@Override
	public int getWriter(WriterDTO wDTO) throws Exception {
		logger.debug("* [SERVICE] Input  ◀ (Controller) : " + wDTO.toString());
		int result = (Integer)dao.selectWriter(wDTO);
		logger.debug("* [SERVICE] Output ◀ (DAO) : " + result);
		return result;
	};

}
