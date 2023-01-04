package com.example.selfspring.member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    public void save(Member member);
    public List<Member> findAllMembers();
    public Optional<Member> finalById(Long id);
}
