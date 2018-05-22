package com.annamorgiel.hungrypets

/**
 * Created by Anna Morgiel on 22.05.2018.
 *
 * default @status is NORMAL, then it can be REQUESTED and finally APPROVED or DISSMISSED
 * one shift can be owned by one @owner
 * at given time 0 for morning and 1 for the evening feeding
 *
 * this is a very simplified version to be further developed
 */

data class Shift(var status: String, var owner: String, var time: Int)