package com.ezen.test.service;

import java.util.List;

import com.ezen.test.domain.BoardVO;
import com.ezen.test.domain.PagingVO;

public interface BoardService {

	int insert(BoardVO bvo);

	List<BoardVO> getList(PagingVO pgvo);

	BoardVO getDetail(int bno);

	void update(BoardVO bvo);

	void delete(int bno);

	int getTotal(PagingVO pgvo);

}
