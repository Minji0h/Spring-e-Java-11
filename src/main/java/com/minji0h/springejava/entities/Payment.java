package com.minji0h.springejava.entities;

import java.time.Instant;

public class Payment {
    private Long id;
    private Instant moment;
    private Order order;
}
