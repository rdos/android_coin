package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
