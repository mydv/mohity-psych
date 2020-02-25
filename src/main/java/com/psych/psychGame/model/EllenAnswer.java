package com.psych.psychGame.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ellenanswers")
public class EllenAnswer extends Auditable {
    @ManyToOne
    @NotNull
    private Question question;

    @Getter
    @Setter
    private long votes = 0L;

    @NotBlank
    @Getter
    @Setter
    private String answer;
}