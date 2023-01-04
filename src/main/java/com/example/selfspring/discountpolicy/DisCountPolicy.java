package com.example.selfspring.discountpolicy;

import com.example.selfspring.member.Member;

import java.util.Optional;

public interface DisCountPolicy {
    public int disCount(int itemPrice, Optional<Member> member);

}



