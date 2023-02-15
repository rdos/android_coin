package com.plcoding.cryptocurrencyappyt.presentation.coin_list

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
