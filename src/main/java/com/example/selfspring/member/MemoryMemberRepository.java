package com.example.selfspring.member;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MemoryMemberRepository implements MemberRepository{

    private ConcurrentHashMap<Long, Member> store = new ConcurrentHashMap<>();
    private Long sequence = 0L;

    @Override
    public void save(Member member) {
        store.put(++sequence, member);
    }

    @Override
    public List<Member> findAllMembers() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Member> finalById(Long id) {
        Optional<Member> member = Optional.ofNullable(store.get(id));
        return member;
    }

    public void clear() {
        store.clear();
    }
}
