package com.example.selfspring.order;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Order {
    private final Long memberId;
    private final String itemName;
    private final int itemPrice;
    private final int discountPrice;
}
