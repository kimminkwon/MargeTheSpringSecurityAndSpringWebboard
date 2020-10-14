package org.zerock.boot10.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zerock.boot10.domain.WebBoard;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class WebBoardModifyDto {
    private Long bno;
    private String title;
    private String writer;
    private String content;
}
