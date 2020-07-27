package com.itkey.sam.writer.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.itkey.sam.writer.dto.WriterDTO;

public class WriterDAOImpl implements WriterDAO {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired private SqlSessionTemplate sqlSession;

	@Override
	public List<WriterDTO> selectWriterList(WriterDTO wDTO) throws Exception {
		logger.debug("* [DAO] Input  ◀ (Service) : " + wDTO.toString());
		List<WriterDTO> out = sqlSession.selectList("selectBoard", wDTO);
		logger.debug("* [DAO] Output ◀ (Mybatis) : " + out.toString());
		return out;
	};

	@Override
	public int selectWriter(WriterDTO wDTO) throws Exception {
		logger.debug("* [DAO] Input  ◀ (Service) : " + wDTO.toString());
		int result = sqlSession.selectOne("selectBoardCount", wDTO);
		logger.debug("* [DAO] Output ◀ (Mybatis) : " + result);
		return result;
	};

}
