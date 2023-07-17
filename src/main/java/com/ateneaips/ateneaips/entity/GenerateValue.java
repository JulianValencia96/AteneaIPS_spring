package com.ateneaips.ateneaips.entity;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {

    GenerationType strategy();

}
