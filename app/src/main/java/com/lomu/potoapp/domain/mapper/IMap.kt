package com.lomu.potoapp.domain.mapper

interface IMap<InputType , OutputType>{

    fun map(item : InputType) : OutputType

}