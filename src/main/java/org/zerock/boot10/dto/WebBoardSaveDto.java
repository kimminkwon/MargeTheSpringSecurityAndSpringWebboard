package org.zerock.boot10.dto;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.zerock.boot10.domain.WebBoard;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebBoardSaveDto {
    private String title;
    private String writer;
    private String content;

    @CreationTimestamp
    private Timestamp regdate;
    @UpdateTimestamp
    private Timestamp updatedate;

    public WebBoard toEntity() {
        return WebBoard.builder()
                .title(this.title)
                .writer(this.writer)
                .content(this.content)
                .build();
    }


}
