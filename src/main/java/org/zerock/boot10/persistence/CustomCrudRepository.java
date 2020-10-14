package org.zerock.boot10.persistence;

import org.springframework.data.repository.CrudRepository;
import org.zerock.boot10.domain.WebBoard;

public interface CustomCrudRepository extends CrudRepository<WebBoard, Long>, CustomWebBoard {

}
