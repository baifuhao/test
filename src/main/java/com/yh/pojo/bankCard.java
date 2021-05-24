package com.yh.pojo;

import lombok.Data;

/**
 * @author lixuan
 */

@Data
public class bankCard {
    private Long cardId;

    private String  issuingBank;

    private String  cardName;

    private String  cardNumber;

    private Long value;

    private String  cardType;

}
