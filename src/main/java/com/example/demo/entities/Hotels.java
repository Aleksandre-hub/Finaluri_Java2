package com.example.demo.entities;

import com.example.demo.dtos.HotelsDto;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@RequiredArgsConstructor
@Table(name = "Hotels")
@Entity
public class Hotels extends  AppEntity{

    @Id
    @Column(name = "Id", nullable = false)
    @SequenceGenerator(name = "HotelSeqId", sequenceName = "Hotel_SEQ_GEN", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HotelSeqId")
    private long id;

    @Column(name = "Name")
    private String hotelName;

    @Column(name = "Price")
    private int price;

    @Column(name = "Reserve_Duration")
    private int reservationDuration;

    public Hotels(HotelsDto HotelDto) {
        if (HotelDto != null) {
            this.hotelName = HotelDto.getName();
            this.price = HotelDto.getPrice();
            this.reservationDuration = HotelDto.getReservationDuration();
        }
    }

}
