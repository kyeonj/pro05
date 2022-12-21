package com.shop.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp.dto.BoardDTO;

@Mapper
@Repository
public interface BoardMapper {
	List<BoardDTO> findAll();
	BoardDTO getBoard(long id);
	void hitsUpdate(long id);
	void addBoard(BoardDTO board);
	void updateBoard(BoardDTO board);
	void delBoard(long id);
}
