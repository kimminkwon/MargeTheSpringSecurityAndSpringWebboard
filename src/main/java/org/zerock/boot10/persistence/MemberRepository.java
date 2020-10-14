package org.zerock.boot10.persistence;

import org.springframework.data.repository.CrudRepository;
import org.zerock.boot10.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {
}
