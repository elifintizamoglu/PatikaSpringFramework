package com.elifintizam.aop.stereotype;

import lombok.*;

@MyStereotype
@Data @NoArgsConstructor @AllArgsConstructor
public class StereotypeBean {
    private Long id;
    private String name;
    private String trade;
}
