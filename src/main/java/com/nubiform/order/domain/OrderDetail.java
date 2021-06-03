package com.nubiform.order.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Product product;

    private String option;
}
