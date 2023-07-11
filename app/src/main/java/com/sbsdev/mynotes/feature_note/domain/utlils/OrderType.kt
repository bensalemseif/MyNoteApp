package com.sbsdev.mynotes.feature_note.domain.utlils

sealed class OrderType{
    object Ascending : OrderType()
    object Descending : OrderType()
}
