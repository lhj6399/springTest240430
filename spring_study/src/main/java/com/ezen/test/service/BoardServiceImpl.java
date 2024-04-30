package com.ezen.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.test.domain.BoardVO;
import com.ezen.test.domain.PagingVO;
import com.ezen.test.repository.BoardDAO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	
	private final BoardDAO bdao;

	@Override
	public int insert(BoardVO bvo) {
		log.info(">>> board register service check!!");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList(PagingVO pgvo) {
		log.info(">>> board list service check!!");
		return bdao.getList(pgvo);
	}

	@Override
	public BoardVO getDetail(int bno) {
		log.info(">>> board detail service check!!");
		//read_count 증가
		bdao.updateReadCount(bno);
		return bdao.getDetail(bno);
	}

	@Override
	public void update(BoardVO bvo) {
		log.info(">>> board update service check!!");
		bdao.update(bvo);
	}

	@Override
	public void delete(int bno) {
		log.info(">>> board delete service check!!");
		bdao.delete(bno);
	}

	@Override
	public int getTotal(PagingVO pgvo) {
		log.info(">>> board getTotal service check!!");
		return bdao.getTotal(pgvo);
	}

}
