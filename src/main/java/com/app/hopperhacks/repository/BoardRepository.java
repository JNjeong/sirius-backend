package com.app.hopperhacks.repository;

import com.app.hopperhacks.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByBoard_code(Long board_code);
}
